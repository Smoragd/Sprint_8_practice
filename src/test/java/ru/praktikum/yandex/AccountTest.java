package ru.praktikum.yandex;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithoutSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithMultipleSpaces() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithSpaceAtStart() {
        Account account = new Account(" ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithSpaceAtEnd() {
        Account account = new Account("ТимотиШаламе ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNameTooShort() {
        Account account = new Account("Т Ш");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameTooLong() {
        Account account = new Account("Тимоти Шаламе Тимоти Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testNullName() {
        Account account = new Account(null);
        assertFalse(account.checkNameToEmboss());
    }
}
