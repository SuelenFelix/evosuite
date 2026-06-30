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

public class GameBalanceParameter_getExtremetrials_18715650655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1356;

    public GameBalanceParameter_getExtremetrials_18715650655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1356 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter"));
        Object term1358 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1359 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1362 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1365 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1368 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1371 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1372 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1375 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1378 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1381 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1384 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1385 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1388 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1391 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1394 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1397 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1398 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1401 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1404 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1407 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1410 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1411 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1414 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1417 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1420 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1356, term1356.getClass(), "name_change_price", 100);
        setIntField(term1359, term1359.getClass(), "pay", 5);
        setIntField(term1359, term1359.getClass(), "win", 10);
        setField(term1358, term1358.getClass(), "clear", term1359);
        setIntField(term1362, term1362.getClass(), "pay", 10);
        setIntField(term1362, term1362.getClass(), "win", 25);
        setField(term1358, term1358.getClass(), "great", term1362);
        setIntField(term1365, term1365.getClass(), "pay", 20);
        setIntField(term1365, term1365.getClass(), "win", 50);
        setField(term1358, term1358.getClass(), "excellent", term1365);
        setIntField(term1368, term1368.getClass(), "pay", 30);
        setIntField(term1368, term1368.getClass(), "win", 90);
        setField(term1358, term1358.getClass(), "perfect", term1368);
        setField(term1356, term1356.getClass(), "easy_trials", term1358);
        setIntField(term1372, term1372.getClass(), "pay", 5);
        setIntField(term1372, term1372.getClass(), "win", 10);
        setField(term1371, term1371.getClass(), "clear", term1372);
        setIntField(term1375, term1375.getClass(), "pay", 10);
        setIntField(term1375, term1375.getClass(), "win", 25);
        setField(term1371, term1371.getClass(), "great", term1375);
        setIntField(term1378, term1378.getClass(), "pay", 20);
        setIntField(term1378, term1378.getClass(), "win", 50);
        setField(term1371, term1371.getClass(), "excellent", term1378);
        setIntField(term1381, term1381.getClass(), "pay", 30);
        setIntField(term1381, term1381.getClass(), "win", 90);
        setField(term1371, term1371.getClass(), "perfect", term1381);
        setField(term1356, term1356.getClass(), "normal_trials", term1371);
        setIntField(term1385, term1385.getClass(), "pay", 5);
        setIntField(term1385, term1385.getClass(), "win", 10);
        setField(term1384, term1384.getClass(), "clear", term1385);
        setIntField(term1388, term1388.getClass(), "pay", 10);
        setIntField(term1388, term1388.getClass(), "win", 25);
        setField(term1384, term1384.getClass(), "great", term1388);
        setIntField(term1391, term1391.getClass(), "pay", 20);
        setIntField(term1391, term1391.getClass(), "win", 50);
        setField(term1384, term1384.getClass(), "excellent", term1391);
        setIntField(term1394, term1394.getClass(), "pay", 30);
        setIntField(term1394, term1394.getClass(), "win", 90);
        setField(term1384, term1384.getClass(), "perfect", term1394);
        setField(term1356, term1356.getClass(), "hard_trials", term1384);
        setIntField(term1398, term1398.getClass(), "pay", 5);
        setIntField(term1398, term1398.getClass(), "win", 10);
        setField(term1397, term1397.getClass(), "clear", term1398);
        setIntField(term1401, term1401.getClass(), "pay", 10);
        setIntField(term1401, term1401.getClass(), "win", 25);
        setField(term1397, term1397.getClass(), "great", term1401);
        setIntField(term1404, term1404.getClass(), "pay", 20);
        setIntField(term1404, term1404.getClass(), "win", 50);
        setField(term1397, term1397.getClass(), "excellent", term1404);
        setIntField(term1407, term1407.getClass(), "pay", 30);
        setIntField(term1407, term1407.getClass(), "win", 90);
        setField(term1397, term1397.getClass(), "perfect", term1407);
        setField(term1356, term1356.getClass(), "extreme_trials", term1397);
        setIntField(term1411, term1411.getClass(), "pay", 5);
        setIntField(term1411, term1411.getClass(), "win", 10);
        setField(term1410, term1410.getClass(), "clear", term1411);
        setIntField(term1414, term1414.getClass(), "pay", 10);
        setIntField(term1414, term1414.getClass(), "win", 25);
        setField(term1410, term1410.getClass(), "great", term1414);
        setIntField(term1417, term1417.getClass(), "pay", 20);
        setIntField(term1417, term1417.getClass(), "win", 50);
        setField(term1410, term1410.getClass(), "excellent", term1417);
        setIntField(term1420, term1420.getClass(), "pay", 30);
        setIntField(term1420, term1420.getClass(), "win", 90);
        setField(term1410, term1410.getClass(), "perfect", term1420);
        setField(term1356, term1356.getClass(), "extra_extreme_trials", term1410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtreme_trials", argTypes, term1356, args);
    }

};


