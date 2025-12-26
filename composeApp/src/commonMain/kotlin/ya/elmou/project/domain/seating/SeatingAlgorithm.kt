package ya.elmou.project.domain.seating

import ya.elmou.project.data.models.Guest
import ya.elmou.project.data.models.Seat

object SeatingAlgorithm {

    fun autoAssign(guests: List<Guest>): List<Seat> {
        return guests.mapIndexed { index, guest ->
            Seat(
                guestId = guest.id,
                position = Pair(index, 0)
            )
        }
    }
}
