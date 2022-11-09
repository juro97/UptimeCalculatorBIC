package at.fhtw.slm.uptimecalculatorbic.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UptimeControllerTest {

    @Test
    void calculateUptime() {
        //A - Arrange (Vorbereiten d.h. eine Instanz der Klasse anlegen die ich testen will)
        var controller = new UptimeController();

        //A - Act - Test ausführen d.h. die Methode mit Testdaten ausführen
        var result = controller.calculateUptime(0.0);

        //A - Assert - Vergleichen ob das Ergebnis der Erwartung entspricht
        assertEquals(0.0, result);
    }

    @Test
    void calculateUpTimeHours() {
        assertEquals(1, 0);
    }
}