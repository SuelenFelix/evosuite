package icu.samnyan.aqua.sega.diva.model.common.attend;

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
import static icu.samnyan.aqua.sega.diva.model.common.attend.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GameBalanceParameter_setNamechangeprice_224646007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490;
     Object term1557;

    public GameBalanceParameter_setNamechangeprice_224646007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1490 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter"));
        Object term1492 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1493 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1496 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1499 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1502 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1505 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1506 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1509 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1512 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1515 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1518 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1519 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1522 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1525 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1528 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1531 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1532 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1535 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1538 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1541 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1544 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1545 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1548 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1551 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1554 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1490, term1490.getClass(), "name_change_price", 100);
        setIntField(term1493, term1493.getClass(), "pay", 5);
        setIntField(term1493, term1493.getClass(), "win", 10);
        setField(term1492, term1492.getClass(), "clear", term1493);
        setIntField(term1496, term1496.getClass(), "pay", 10);
        setIntField(term1496, term1496.getClass(), "win", 25);
        setField(term1492, term1492.getClass(), "great", term1496);
        setIntField(term1499, term1499.getClass(), "pay", 20);
        setIntField(term1499, term1499.getClass(), "win", 50);
        setField(term1492, term1492.getClass(), "excellent", term1499);
        setIntField(term1502, term1502.getClass(), "pay", 30);
        setIntField(term1502, term1502.getClass(), "win", 90);
        setField(term1492, term1492.getClass(), "perfect", term1502);
        setField(term1490, term1490.getClass(), "easy_trials", term1492);
        setIntField(term1506, term1506.getClass(), "pay", 5);
        setIntField(term1506, term1506.getClass(), "win", 10);
        setField(term1505, term1505.getClass(), "clear", term1506);
        setIntField(term1509, term1509.getClass(), "pay", 10);
        setIntField(term1509, term1509.getClass(), "win", 25);
        setField(term1505, term1505.getClass(), "great", term1509);
        setIntField(term1512, term1512.getClass(), "pay", 20);
        setIntField(term1512, term1512.getClass(), "win", 50);
        setField(term1505, term1505.getClass(), "excellent", term1512);
        setIntField(term1515, term1515.getClass(), "pay", 30);
        setIntField(term1515, term1515.getClass(), "win", 90);
        setField(term1505, term1505.getClass(), "perfect", term1515);
        setField(term1490, term1490.getClass(), "normal_trials", term1505);
        setIntField(term1519, term1519.getClass(), "pay", 5);
        setIntField(term1519, term1519.getClass(), "win", 10);
        setField(term1518, term1518.getClass(), "clear", term1519);
        setIntField(term1522, term1522.getClass(), "pay", 10);
        setIntField(term1522, term1522.getClass(), "win", 25);
        setField(term1518, term1518.getClass(), "great", term1522);
        setIntField(term1525, term1525.getClass(), "pay", 20);
        setIntField(term1525, term1525.getClass(), "win", 50);
        setField(term1518, term1518.getClass(), "excellent", term1525);
        setIntField(term1528, term1528.getClass(), "pay", 30);
        setIntField(term1528, term1528.getClass(), "win", 90);
        setField(term1518, term1518.getClass(), "perfect", term1528);
        setField(term1490, term1490.getClass(), "hard_trials", term1518);
        setIntField(term1532, term1532.getClass(), "pay", 5);
        setIntField(term1532, term1532.getClass(), "win", 10);
        setField(term1531, term1531.getClass(), "clear", term1532);
        setIntField(term1535, term1535.getClass(), "pay", 10);
        setIntField(term1535, term1535.getClass(), "win", 25);
        setField(term1531, term1531.getClass(), "great", term1535);
        setIntField(term1538, term1538.getClass(), "pay", 20);
        setIntField(term1538, term1538.getClass(), "win", 50);
        setField(term1531, term1531.getClass(), "excellent", term1538);
        setIntField(term1541, term1541.getClass(), "pay", 30);
        setIntField(term1541, term1541.getClass(), "win", 90);
        setField(term1531, term1531.getClass(), "perfect", term1541);
        setField(term1490, term1490.getClass(), "extreme_trials", term1531);
        setIntField(term1545, term1545.getClass(), "pay", 5);
        setIntField(term1545, term1545.getClass(), "win", 10);
        setField(term1544, term1544.getClass(), "clear", term1545);
        setIntField(term1548, term1548.getClass(), "pay", 10);
        setIntField(term1548, term1548.getClass(), "win", 25);
        setField(term1544, term1544.getClass(), "great", term1548);
        setIntField(term1551, term1551.getClass(), "pay", 20);
        setIntField(term1551, term1551.getClass(), "win", 50);
        setField(term1544, term1544.getClass(), "excellent", term1551);
        setIntField(term1554, term1554.getClass(), "pay", 30);
        setIntField(term1554, term1554.getClass(), "win", 90);
        setField(term1544, term1544.getClass(), "perfect", term1554);
        setField(term1490, term1490.getClass(), "extra_extreme_trials", term1544);
        term1557 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1557;
        callMethod(klass, "setName_change_price", argTypes, term1490, args);
    }

};


