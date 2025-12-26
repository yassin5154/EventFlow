package ya.elmou.project.data.repository

import ya.elmou.project.data.models.Event

class EventRepository {

    private val events = mutableListOf<Event>()

    fun getEvents(): List<Event> = events

    fun addEvent(event: Event) {
        events.add(event)
    }

    fun getEventById(id: Long): Event? {
        return events.find { it.id == id }
    }

    fun deleteEvent(id: Long) {
        val index = events.indexOfFirst { event ->
            event.id == id
        }
        if (index != -1) {
            events.removeAt(index)
        }
    }

}
