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

public class GameBalanceParameter_toInternal_2813440030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021;

    public GameBalanceParameter_toInternal_2813440030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1021 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter"));
        Object term1023 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1024 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1027 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1030 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1033 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1036 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1037 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1040 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1043 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1046 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1049 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1050 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1053 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1056 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1059 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1062 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1063 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1066 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1069 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1072 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1075 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term1076 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1079 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1082 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term1085 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term1021, term1021.getClass(), "name_change_price", 100);
        setIntField(term1024, term1024.getClass(), "pay", 5);
        setIntField(term1024, term1024.getClass(), "win", 10);
        setField(term1023, term1023.getClass(), "clear", term1024);
        setIntField(term1027, term1027.getClass(), "pay", 10);
        setIntField(term1027, term1027.getClass(), "win", 25);
        setField(term1023, term1023.getClass(), "great", term1027);
        setIntField(term1030, term1030.getClass(), "pay", 20);
        setIntField(term1030, term1030.getClass(), "win", 50);
        setField(term1023, term1023.getClass(), "excellent", term1030);
        setIntField(term1033, term1033.getClass(), "pay", 30);
        setIntField(term1033, term1033.getClass(), "win", 90);
        setField(term1023, term1023.getClass(), "perfect", term1033);
        setField(term1021, term1021.getClass(), "easy_trials", term1023);
        setIntField(term1037, term1037.getClass(), "pay", 5);
        setIntField(term1037, term1037.getClass(), "win", 10);
        setField(term1036, term1036.getClass(), "clear", term1037);
        setIntField(term1040, term1040.getClass(), "pay", 10);
        setIntField(term1040, term1040.getClass(), "win", 25);
        setField(term1036, term1036.getClass(), "great", term1040);
        setIntField(term1043, term1043.getClass(), "pay", 20);
        setIntField(term1043, term1043.getClass(), "win", 50);
        setField(term1036, term1036.getClass(), "excellent", term1043);
        setIntField(term1046, term1046.getClass(), "pay", 30);
        setIntField(term1046, term1046.getClass(), "win", 90);
        setField(term1036, term1036.getClass(), "perfect", term1046);
        setField(term1021, term1021.getClass(), "normal_trials", term1036);
        setIntField(term1050, term1050.getClass(), "pay", 5);
        setIntField(term1050, term1050.getClass(), "win", 10);
        setField(term1049, term1049.getClass(), "clear", term1050);
        setIntField(term1053, term1053.getClass(), "pay", 10);
        setIntField(term1053, term1053.getClass(), "win", 25);
        setField(term1049, term1049.getClass(), "great", term1053);
        setIntField(term1056, term1056.getClass(), "pay", 20);
        setIntField(term1056, term1056.getClass(), "win", 50);
        setField(term1049, term1049.getClass(), "excellent", term1056);
        setIntField(term1059, term1059.getClass(), "pay", 30);
        setIntField(term1059, term1059.getClass(), "win", 90);
        setField(term1049, term1049.getClass(), "perfect", term1059);
        setField(term1021, term1021.getClass(), "hard_trials", term1049);
        setIntField(term1063, term1063.getClass(), "pay", 5);
        setIntField(term1063, term1063.getClass(), "win", 10);
        setField(term1062, term1062.getClass(), "clear", term1063);
        setIntField(term1066, term1066.getClass(), "pay", 10);
        setIntField(term1066, term1066.getClass(), "win", 25);
        setField(term1062, term1062.getClass(), "great", term1066);
        setIntField(term1069, term1069.getClass(), "pay", 20);
        setIntField(term1069, term1069.getClass(), "win", 50);
        setField(term1062, term1062.getClass(), "excellent", term1069);
        setIntField(term1072, term1072.getClass(), "pay", 30);
        setIntField(term1072, term1072.getClass(), "win", 90);
        setField(term1062, term1062.getClass(), "perfect", term1072);
        setField(term1021, term1021.getClass(), "extreme_trials", term1062);
        setIntField(term1076, term1076.getClass(), "pay", 5);
        setIntField(term1076, term1076.getClass(), "win", 10);
        setField(term1075, term1075.getClass(), "clear", term1076);
        setIntField(term1079, term1079.getClass(), "pay", 10);
        setIntField(term1079, term1079.getClass(), "win", 25);
        setField(term1075, term1075.getClass(), "great", term1079);
        setIntField(term1082, term1082.getClass(), "pay", 20);
        setIntField(term1082, term1082.getClass(), "win", 50);
        setField(term1075, term1075.getClass(), "excellent", term1082);
        setIntField(term1085, term1085.getClass(), "pay", 30);
        setIntField(term1085, term1085.getClass(), "win", 90);
        setField(term1075, term1075.getClass(), "perfect", term1085);
        setField(term1021, term1021.getClass(), "extra_extreme_trials", term1075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toInternal", argTypes, term1021, args);
    }

};


