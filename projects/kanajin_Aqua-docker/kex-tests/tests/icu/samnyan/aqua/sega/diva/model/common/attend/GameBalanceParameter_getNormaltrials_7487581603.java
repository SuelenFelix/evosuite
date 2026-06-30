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

public class GameBalanceParameter_getNormaltrials_7487581603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1222;

    public GameBalanceParameter_getNormaltrials_7487581603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1222 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter"));
        Object term1224 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1225 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1228 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1231 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1234 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1237 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1238 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1241 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1244 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1247 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1250 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1251 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1254 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1257 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1260 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1263 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1264 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1267 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1270 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1273 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1276 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1277 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1280 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1283 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1286 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1222, term1222.getClass(), "name_change_price", 100);
        setIntField(term1225, term1225.getClass(), "pay", 5);
        setIntField(term1225, term1225.getClass(), "win", 10);
        setField(term1224, term1224.getClass(), "clear", term1225);
        setIntField(term1228, term1228.getClass(), "pay", 10);
        setIntField(term1228, term1228.getClass(), "win", 25);
        setField(term1224, term1224.getClass(), "great", term1228);
        setIntField(term1231, term1231.getClass(), "pay", 20);
        setIntField(term1231, term1231.getClass(), "win", 50);
        setField(term1224, term1224.getClass(), "excellent", term1231);
        setIntField(term1234, term1234.getClass(), "pay", 30);
        setIntField(term1234, term1234.getClass(), "win", 90);
        setField(term1224, term1224.getClass(), "perfect", term1234);
        setField(term1222, term1222.getClass(), "easy_trials", term1224);
        setIntField(term1238, term1238.getClass(), "pay", 5);
        setIntField(term1238, term1238.getClass(), "win", 10);
        setField(term1237, term1237.getClass(), "clear", term1238);
        setIntField(term1241, term1241.getClass(), "pay", 10);
        setIntField(term1241, term1241.getClass(), "win", 25);
        setField(term1237, term1237.getClass(), "great", term1241);
        setIntField(term1244, term1244.getClass(), "pay", 20);
        setIntField(term1244, term1244.getClass(), "win", 50);
        setField(term1237, term1237.getClass(), "excellent", term1244);
        setIntField(term1247, term1247.getClass(), "pay", 30);
        setIntField(term1247, term1247.getClass(), "win", 90);
        setField(term1237, term1237.getClass(), "perfect", term1247);
        setField(term1222, term1222.getClass(), "normal_trials", term1237);
        setIntField(term1251, term1251.getClass(), "pay", 5);
        setIntField(term1251, term1251.getClass(), "win", 10);
        setField(term1250, term1250.getClass(), "clear", term1251);
        setIntField(term1254, term1254.getClass(), "pay", 10);
        setIntField(term1254, term1254.getClass(), "win", 25);
        setField(term1250, term1250.getClass(), "great", term1254);
        setIntField(term1257, term1257.getClass(), "pay", 20);
        setIntField(term1257, term1257.getClass(), "win", 50);
        setField(term1250, term1250.getClass(), "excellent", term1257);
        setIntField(term1260, term1260.getClass(), "pay", 30);
        setIntField(term1260, term1260.getClass(), "win", 90);
        setField(term1250, term1250.getClass(), "perfect", term1260);
        setField(term1222, term1222.getClass(), "hard_trials", term1250);
        setIntField(term1264, term1264.getClass(), "pay", 5);
        setIntField(term1264, term1264.getClass(), "win", 10);
        setField(term1263, term1263.getClass(), "clear", term1264);
        setIntField(term1267, term1267.getClass(), "pay", 10);
        setIntField(term1267, term1267.getClass(), "win", 25);
        setField(term1263, term1263.getClass(), "great", term1267);
        setIntField(term1270, term1270.getClass(), "pay", 20);
        setIntField(term1270, term1270.getClass(), "win", 50);
        setField(term1263, term1263.getClass(), "excellent", term1270);
        setIntField(term1273, term1273.getClass(), "pay", 30);
        setIntField(term1273, term1273.getClass(), "win", 90);
        setField(term1263, term1263.getClass(), "perfect", term1273);
        setField(term1222, term1222.getClass(), "extreme_trials", term1263);
        setIntField(term1277, term1277.getClass(), "pay", 5);
        setIntField(term1277, term1277.getClass(), "win", 10);
        setField(term1276, term1276.getClass(), "clear", term1277);
        setIntField(term1280, term1280.getClass(), "pay", 10);
        setIntField(term1280, term1280.getClass(), "win", 25);
        setField(term1276, term1276.getClass(), "great", term1280);
        setIntField(term1283, term1283.getClass(), "pay", 20);
        setIntField(term1283, term1283.getClass(), "win", 50);
        setField(term1276, term1276.getClass(), "excellent", term1283);
        setIntField(term1286, term1286.getClass(), "pay", 30);
        setIntField(term1286, term1286.getClass(), "win", 90);
        setField(term1276, term1276.getClass(), "perfect", term1286);
        setField(term1222, term1222.getClass(), "extra_extreme_trials", term1276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNormal_trials", argTypes, term1222, args);
    }

};


