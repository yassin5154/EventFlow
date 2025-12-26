package ya.elmou.project.data.repository

import ya.elmou.project.data.models.Guest

class GuestRepository {

    private val guests = mutableListOf<Guest>()

    fun getGuests(): List<Guest> = guests

    fun addGuest(guest: Guest) {
        guests.add(guest)
    }

    fun deleteGuest(id: Long) {
        val index = guests.indexOfFirst { guest ->
            guest.id == id
        }
        if (index != -1) {
            guests.removeAt(index)
        }
    }

}
