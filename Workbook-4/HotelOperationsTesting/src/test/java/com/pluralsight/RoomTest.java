package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void testCheckIn_SetsRoomOccupiedAndDirty() {
        Room room = new Room(2, 100.0, false, false);
    }

    public void testCheckIn_DoesNotOverrideIfOccupied() {
        Room room = new Room(2, 100.0, true, false);
    }

    public void testCheckout_SetsRoomNotOccupied() {
        Room room = new Room(2, 100.0, true, true);
    }

    @Test
    public void testCleanRoom_OnlyIfNotOccupied() {
        Room room = new Room(2, 100.0, false, true);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }

    @Test
    public void testCleanRoom_DoesNothingIfOccupied() {
        Room room = new Room(2, 100.0, true, true);
        room.cleanRoom();
        assertTrue(room.isDirty());
    }
}
