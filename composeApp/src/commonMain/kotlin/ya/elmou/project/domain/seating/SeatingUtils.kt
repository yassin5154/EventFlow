package ya.elmou.project.domain.seating

import ya.elmou.project.data.models.Guest
import ya.elmou.project.data.models.Seat

object SeatingUtils {

    /**
     * Vérifie si une place est déjà occupée
     */
    fun isSeatOccupied(
        seats: List<Seat>,
        position: Pair<Int, Int>
    ): Boolean {
        return seats.any { seat ->
            seat.position == position
        }
    }

    /**
     * Récupère le siège d’un invité
     */
    fun seatForGuest(
        seats: List<Seat>,
        guestId: Long
    ): Seat? {
        return seats.find { seat ->
            seat.guestId == guestId
        }
    }

    /**
     * Vérifie si tous les invités ont une place
     */
    fun allGuestsSeated(
        guests: List<Guest>,
        seats: List<Seat>
    ): Boolean {
        return guests.all { guest ->
            seats.any { seat ->
                seat.guestId == guest.id
            }
        }
    }

    /**
     * Supprime l’invité de son siège
     */
    fun removeGuestFromSeat(
        seats: MutableList<Seat>,
        guestId: Long
    ) {
        val index = seats.indexOfFirst { seat ->
            seat.guestId == guestId
        }
        if (index != -1) {
            seats.removeAt(index)
        }
    }

    /**
     * Compte le nombre de sièges occupés
     */
    fun occupiedSeatCount(seats: List<Seat>): Int {
        return seats.size
    }
}
