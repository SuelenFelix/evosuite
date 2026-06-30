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

public class GameBalanceParameter_toString_145837442316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2162;

    public GameBalanceParameter_toString_145837442316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2162 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter"));
        Object term2164 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term2165 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2168 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2171 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2174 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2177 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term2178 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2181 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2184 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2187 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2190 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term2191 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2194 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2197 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2200 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2203 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term2204 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2207 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2210 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2213 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2216 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBidSet"));
        Object term2217 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2220 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2223 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        Object term2226 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceTrialBid"));
        setIntField(term2162, term2162.getClass(), "name_change_price", 100);
        setIntField(term2165, term2165.getClass(), "pay", 5);
        setIntField(term2165, term2165.getClass(), "win", 10);
        setField(term2164, term2164.getClass(), "clear", term2165);
        setIntField(term2168, term2168.getClass(), "pay", 10);
        setIntField(term2168, term2168.getClass(), "win", 25);
        setField(term2164, term2164.getClass(), "great", term2168);
        setIntField(term2171, term2171.getClass(), "pay", 20);
        setIntField(term2171, term2171.getClass(), "win", 50);
        setField(term2164, term2164.getClass(), "excellent", term2171);
        setIntField(term2174, term2174.getClass(), "pay", 30);
        setIntField(term2174, term2174.getClass(), "win", 90);
        setField(term2164, term2164.getClass(), "perfect", term2174);
        setField(term2162, term2162.getClass(), "easy_trials", term2164);
        setIntField(term2178, term2178.getClass(), "pay", 5);
        setIntField(term2178, term2178.getClass(), "win", 10);
        setField(term2177, term2177.getClass(), "clear", term2178);
        setIntField(term2181, term2181.getClass(), "pay", 10);
        setIntField(term2181, term2181.getClass(), "win", 25);
        setField(term2177, term2177.getClass(), "great", term2181);
        setIntField(term2184, term2184.getClass(), "pay", 20);
        setIntField(term2184, term2184.getClass(), "win", 50);
        setField(term2177, term2177.getClass(), "excellent", term2184);
        setIntField(term2187, term2187.getClass(), "pay", 30);
        setIntField(term2187, term2187.getClass(), "win", 90);
        setField(term2177, term2177.getClass(), "perfect", term2187);
        setField(term2162, term2162.getClass(), "normal_trials", term2177);
        setIntField(term2191, term2191.getClass(), "pay", 5);
        setIntField(term2191, term2191.getClass(), "win", 10);
        setField(term2190, term2190.getClass(), "clear", term2191);
        setIntField(term2194, term2194.getClass(), "pay", 10);
        setIntField(term2194, term2194.getClass(), "win", 25);
        setField(term2190, term2190.getClass(), "great", term2194);
        setIntField(term2197, term2197.getClass(), "pay", 20);
        setIntField(term2197, term2197.getClass(), "win", 50);
        setField(term2190, term2190.getClass(), "excellent", term2197);
        setIntField(term2200, term2200.getClass(), "pay", 30);
        setIntField(term2200, term2200.getClass(), "win", 90);
        setField(term2190, term2190.getClass(), "perfect", term2200);
        setField(term2162, term2162.getClass(), "hard_trials", term2190);
        setIntField(term2204, term2204.getClass(), "pay", 5);
        setIntField(term2204, term2204.getClass(), "win", 10);
        setField(term2203, term2203.getClass(), "clear", term2204);
        setIntField(term2207, term2207.getClass(), "pay", 10);
        setIntField(term2207, term2207.getClass(), "win", 25);
        setField(term2203, term2203.getClass(), "great", term2207);
        setIntField(term2210, term2210.getClass(), "pay", 20);
        setIntField(term2210, term2210.getClass(), "win", 50);
        setField(term2203, term2203.getClass(), "excellent", term2210);
        setIntField(term2213, term2213.getClass(), "pay", 30);
        setIntField(term2213, term2213.getClass(), "win", 90);
        setField(term2203, term2203.getClass(), "perfect", term2213);
        setField(term2162, term2162.getClass(), "extreme_trials", term2203);
        setIntField(term2217, term2217.getClass(), "pay", 5);
        setIntField(term2217, term2217.getClass(), "win", 10);
        setField(term2216, term2216.getClass(), "clear", term2217);
        setIntField(term2220, term2220.getClass(), "pay", 10);
        setIntField(term2220, term2220.getClass(), "win", 25);
        setField(term2216, term2216.getClass(), "great", term2220);
        setIntField(term2223, term2223.getClass(), "pay", 20);
        setIntField(term2223, term2223.getClass(), "win", 50);
        setField(term2216, term2216.getClass(), "excellent", term2223);
        setIntField(term2226, term2226.getClass(), "pay", 30);
        setIntField(term2226, term2226.getClass(), "win", 90);
        setField(term2216, term2216.getClass(), "perfect", term2226);
        setField(term2162, term2162.getClass(), "extra_extreme_trials", term2216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.attend.GameBalanceParameter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2162, args);
    }

};


