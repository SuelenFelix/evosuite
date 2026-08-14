package ru.yandex.practicum.filmorate.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ValidationErrorResponse_getViolations_3857903100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1627;

    public ValidationErrorResponse_getViolations_3857903100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1630 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Violation"));
        setField(term1630, term1630.getClass(), "error", "");
        setField(term1630, term1630.getClass(), "message", "");
        Object term1633 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Violation"));
        setField(term1633, term1633.getClass(), "error", "");
        setField(term1633, term1633.getClass(), "message", "");
        Object term1636 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Violation"));
        setField(term1636, term1636.getClass(), "error", "");
        setField(term1636, term1636.getClass(), "message", "");
        Object term1639 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Violation"));
        setField(term1639, term1639.getClass(), "error", "");
        setField(term1639, term1639.getClass(), "message", "");
        Object term1642 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.Violation"));
        setField(term1642, term1642.getClass(), "error", "");
        setField(term1642, term1642.getClass(), "message", "");
        ArrayList term1628 = new ArrayList();
        ((ArrayList) term1628).add(term1630);
        ((ArrayList) term1628).add(term1633);
        ((ArrayList) term1628).add(term1636);
        ((ArrayList) term1628).add(term1639);
        ((ArrayList) term1628).add(term1642);
        term1627 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.ValidationErrorResponse"));
        setField(term1627, term1627.getClass(), "violations", term1628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.ValidationErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getViolations", argTypes, term1627, args);
    }

};


