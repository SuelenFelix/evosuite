package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_getPlayedCustom2_4055413416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46497;

    public RecentResp_getPlayedCustom2_4055413416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46497 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46503 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46513 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46499, term46499.getClass(), "year", 2016);
        setShortField(term46499, term46499.getClass(), "month", (short) 12);
        setShortField(term46499, term46499.getClass(), "day", (short) 3);
        setField(term46498, term46498.getClass(), "date", term46499);
        setByteField(term46503, term46503.getClass(), "hour", (byte) 8);
        setByteField(term46503, term46503.getClass(), "minute", (byte) 59);
        setByteField(term46503, term46503.getClass(), "second", (byte) 39);
        setIntField(term46503, term46503.getClass(), "nano", 208911877);
        setField(term46498, term46498.getClass(), "time", term46503);
        setField(term46497, term46497.getClass(), "playDate", term46498);
        setIntField(term46509, term46509.getClass(), "year", 2023);
        setShortField(term46509, term46509.getClass(), "month", (short) 6);
        setShortField(term46509, term46509.getClass(), "day", (short) 5);
        setField(term46508, term46508.getClass(), "date", term46509);
        setByteField(term46513, term46513.getClass(), "hour", (byte) 22);
        setByteField(term46513, term46513.getClass(), "minute", (byte) 22);
        setByteField(term46513, term46513.getClass(), "second", (byte) 4);
        setIntField(term46513, term46513.getClass(), "nano", 656087896);
        setField(term46508, term46508.getClass(), "time", term46513);
        setField(term46497, term46497.getClass(), "userPlayDate", term46508);
        setIntField(term46497, term46497.getClass(), "musicId", 1993504802);
        setIntField(term46497, term46497.getClass(), "level", 526852618);
        setIntField(term46497, term46497.getClass(), "customId", 903788782);
        setIntField(term46497, term46497.getClass(), "playedCustom1", -608033702);
        setIntField(term46497, term46497.getClass(), "playedCustom2", 1118825073);
        setIntField(term46497, term46497.getClass(), "playedCustom3", 751108197);
        setIntField(term46497, term46497.getClass(), "track", -1810066487);
        setIntField(term46497, term46497.getClass(), "score", 12697707);
        setIntField(term46497, term46497.getClass(), "rank", -971143668);
        setIntField(term46497, term46497.getClass(), "maxCombo", 127763053);
        setIntField(term46497, term46497.getClass(), "maxChain", 968035207);
        setIntField(term46497, term46497.getClass(), "rateTap", -643589717);
        setIntField(term46497, term46497.getClass(), "rateHold", -1599482698);
        setIntField(term46497, term46497.getClass(), "rateSlide", -370600915);
        setIntField(term46497, term46497.getClass(), "rateAir", -311572875);
        setIntField(term46497, term46497.getClass(), "rateFlick", 355595594);
        setIntField(term46497, term46497.getClass(), "judgeGuilty", 842697786);
        setIntField(term46497, term46497.getClass(), "judgeAttack", 1685808201);
        setIntField(term46497, term46497.getClass(), "judgeJustice", 1565114969);
        setIntField(term46497, term46497.getClass(), "judgeCritical", 806831765);
        setIntField(term46497, term46497.getClass(), "playerRating", -1445658721);
        setBooleanField(term46497, term46497.getClass(), "isNewRecord", true);
        setBooleanField(term46497, term46497.getClass(), "isFullCombo", false);
        setIntField(term46497, term46497.getClass(), "fullChainKind", 872435483);
        setBooleanField(term46497, term46497.getClass(), "isAllJustice", true);
        setIntField(term46497, term46497.getClass(), "characterId", 110611143);
        setIntField(term46497, term46497.getClass(), "skillId", 793381056);
        setIntField(term46497, term46497.getClass(), "playKind", 65007514);
        setBooleanField(term46497, term46497.getClass(), "isClear", true);
        setIntField(term46497, term46497.getClass(), "skillLevel", 1731844126);
        setIntField(term46497, term46497.getClass(), "skillEffect", -861962061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedCustom2", argTypes, term46497, args);
    }

};


