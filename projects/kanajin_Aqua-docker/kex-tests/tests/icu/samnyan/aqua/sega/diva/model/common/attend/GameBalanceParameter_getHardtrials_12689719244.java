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

public class GameBalanceParameter_getHardtrials_12689719244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1289;

    public GameBalanceParameter_getHardtrials_12689719244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1289 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter"));
        Object term1291 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1292 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1295 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1298 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1301 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1304 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1305 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1308 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1311 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1314 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1317 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1318 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1321 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1324 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1327 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1330 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1331 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1334 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1337 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1340 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1343 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1344 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1347 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1350 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1353 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1289, term1289.getClass(), "name_change_price", 100);
        setIntField(term1292, term1292.getClass(), "pay", 5);
        setIntField(term1292, term1292.getClass(), "win", 10);
        setField(term1291, term1291.getClass(), "clear", term1292);
        setIntField(term1295, term1295.getClass(), "pay", 10);
        setIntField(term1295, term1295.getClass(), "win", 25);
        setField(term1291, term1291.getClass(), "great", term1295);
        setIntField(term1298, term1298.getClass(), "pay", 20);
        setIntField(term1298, term1298.getClass(), "win", 50);
        setField(term1291, term1291.getClass(), "excellent", term1298);
        setIntField(term1301, term1301.getClass(), "pay", 30);
        setIntField(term1301, term1301.getClass(), "win", 90);
        setField(term1291, term1291.getClass(), "perfect", term1301);
        setField(term1289, term1289.getClass(), "easy_trials", term1291);
        setIntField(term1305, term1305.getClass(), "pay", 5);
        setIntField(term1305, term1305.getClass(), "win", 10);
        setField(term1304, term1304.getClass(), "clear", term1305);
        setIntField(term1308, term1308.getClass(), "pay", 10);
        setIntField(term1308, term1308.getClass(), "win", 25);
        setField(term1304, term1304.getClass(), "great", term1308);
        setIntField(term1311, term1311.getClass(), "pay", 20);
        setIntField(term1311, term1311.getClass(), "win", 50);
        setField(term1304, term1304.getClass(), "excellent", term1311);
        setIntField(term1314, term1314.getClass(), "pay", 30);
        setIntField(term1314, term1314.getClass(), "win", 90);
        setField(term1304, term1304.getClass(), "perfect", term1314);
        setField(term1289, term1289.getClass(), "normal_trials", term1304);
        setIntField(term1318, term1318.getClass(), "pay", 5);
        setIntField(term1318, term1318.getClass(), "win", 10);
        setField(term1317, term1317.getClass(), "clear", term1318);
        setIntField(term1321, term1321.getClass(), "pay", 10);
        setIntField(term1321, term1321.getClass(), "win", 25);
        setField(term1317, term1317.getClass(), "great", term1321);
        setIntField(term1324, term1324.getClass(), "pay", 20);
        setIntField(term1324, term1324.getClass(), "win", 50);
        setField(term1317, term1317.getClass(), "excellent", term1324);
        setIntField(term1327, term1327.getClass(), "pay", 30);
        setIntField(term1327, term1327.getClass(), "win", 90);
        setField(term1317, term1317.getClass(), "perfect", term1327);
        setField(term1289, term1289.getClass(), "hard_trials", term1317);
        setIntField(term1331, term1331.getClass(), "pay", 5);
        setIntField(term1331, term1331.getClass(), "win", 10);
        setField(term1330, term1330.getClass(), "clear", term1331);
        setIntField(term1334, term1334.getClass(), "pay", 10);
        setIntField(term1334, term1334.getClass(), "win", 25);
        setField(term1330, term1330.getClass(), "great", term1334);
        setIntField(term1337, term1337.getClass(), "pay", 20);
        setIntField(term1337, term1337.getClass(), "win", 50);
        setField(term1330, term1330.getClass(), "excellent", term1337);
        setIntField(term1340, term1340.getClass(), "pay", 30);
        setIntField(term1340, term1340.getClass(), "win", 90);
        setField(term1330, term1330.getClass(), "perfect", term1340);
        setField(term1289, term1289.getClass(), "extreme_trials", term1330);
        setIntField(term1344, term1344.getClass(), "pay", 5);
        setIntField(term1344, term1344.getClass(), "win", 10);
        setField(term1343, term1343.getClass(), "clear", term1344);
        setIntField(term1347, term1347.getClass(), "pay", 10);
        setIntField(term1347, term1347.getClass(), "win", 25);
        setField(term1343, term1343.getClass(), "great", term1347);
        setIntField(term1350, term1350.getClass(), "pay", 20);
        setIntField(term1350, term1350.getClass(), "win", 50);
        setField(term1343, term1343.getClass(), "excellent", term1350);
        setIntField(term1353, term1353.getClass(), "pay", 30);
        setIntField(term1353, term1353.getClass(), "win", 90);
        setField(term1343, term1343.getClass(), "perfect", term1353);
        setField(term1289, term1289.getClass(), "extra_extreme_trials", term1343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHard_trials", argTypes, term1289, args);
    }

};


