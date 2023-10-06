import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NpcTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Npc npc1 = new Npc("Argit", 22, "He is a brave warrior");

        Npc npc2 = npc1.clone();
        npc2.setName("Kevin");
        npc2.setAge(35);
        npc2.setLore("He is a wise wizard");

        assertEquals("NPC: Nome:Argit Age:22 Lore:He is a brave warrior", npc1.toString());
        assertEquals("NPC: Nome:Kevin Age:35 Lore:He is a wise wizard", npc2.toString());
    }
}