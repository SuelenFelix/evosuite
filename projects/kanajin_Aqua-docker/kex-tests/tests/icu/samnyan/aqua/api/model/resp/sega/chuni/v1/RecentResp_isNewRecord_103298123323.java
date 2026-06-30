package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_isNewRecord_103298123323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52551;

    public RecentResp_isNewRecord_103298123323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52551 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52557 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52567 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52553, term52553.getClass(), "year", 2025);
        setShortField(term52553, term52553.getClass(), "month", (short) 7);
        setShortField(term52553, term52553.getClass(), "day", (short) 31);
        setField(term52552, term52552.getClass(), "date", term52553);
        setByteField(term52557, term52557.getClass(), "hour", (byte) 14);
        setByteField(term52557, term52557.getClass(), "minute", (byte) 45);
        setByteField(term52557, term52557.getClass(), "second", (byte) 16);
        setIntField(term52557, term52557.getClass(), "nano", 864162960);
        setField(term52552, term52552.getClass(), "time", term52557);
        setField(term52551, term52551.getClass(), "playDate", term52552);
        setIntField(term52563, term52563.getClass(), "year", 2018);
        setShortField(term52563, term52563.getClass(), "month", (short) 11);
        setShortField(term52563, term52563.getClass(), "day", (short) 5);
        setField(term52562, term52562.getClass(), "date", term52563);
        setByteField(term52567, term52567.getClass(), "hour", (byte) 11);
        setByteField(term52567, term52567.getClass(), "minute", (byte) 27);
        setByteField(term52567, term52567.getClass(), "second", (byte) 20);
        setIntField(term52567, term52567.getClass(), "nano", 980926676);
        setField(term52562, term52562.getClass(), "time", term52567);
        setField(term52551, term52551.getClass(), "userPlayDate", term52562);
        setIntField(term52551, term52551.getClass(), "musicId", -2025145756);
        setIntField(term52551, term52551.getClass(), "level", -1865692813);
        setIntField(term52551, term52551.getClass(), "customId", 1996398924);
        setIntField(term52551, term52551.getClass(), "playedCustom1", -400305198);
        setIntField(term52551, term52551.getClass(), "playedCustom2", 1551023146);
        setIntField(term52551, term52551.getClass(), "playedCustom3", 545151275);
        setIntField(term52551, term52551.getClass(), "track", -125397975);
        setIntField(term52551, term52551.getClass(), "score", -595763151);
        setIntField(term52551, term52551.getClass(), "rank", -1927187775);
        setIntField(term52551, term52551.getClass(), "maxCombo", -246129741);
        setIntField(term52551, term52551.getClass(), "maxChain", -1681312941);
        setIntField(term52551, term52551.getClass(), "rateTap", -2026593848);
        setIntField(term52551, term52551.getClass(), "rateHold", -1523977596);
        setIntField(term52551, term52551.getClass(), "rateSlide", -1036117253);
        setIntField(term52551, term52551.getClass(), "rateAir", -697114016);
        setIntField(term52551, term52551.getClass(), "rateFlick", 1991952957);
        setIntField(term52551, term52551.getClass(), "judgeGuilty", 1877895251);
        setIntField(term52551, term52551.getClass(), "judgeAttack", 962916253);
        setIntField(term52551, term52551.getClass(), "judgeJustice", 1580094069);
        setIntField(term52551, term52551.getClass(), "judgeCritical", -890066143);
        setIntField(term52551, term52551.getClass(), "playerRating", 1782477754);
        setBooleanField(term52551, term52551.getClass(), "isNewRecord", true);
        setBooleanField(term52551, term52551.getClass(), "isFullCombo", true);
        setIntField(term52551, term52551.getClass(), "fullChainKind", 1979972143);
        setBooleanField(term52551, term52551.getClass(), "isAllJustice", true);
        setIntField(term52551, term52551.getClass(), "characterId", -1445141749);
        setIntField(term52551, term52551.getClass(), "skillId", 231866725);
        setIntField(term52551, term52551.getClass(), "playKind", 264142674);
        setBooleanField(term52551, term52551.getClass(), "isClear", true);
        setIntField(term52551, term52551.getClass(), "skillLevel", 318938584);
        setIntField(term52551, term52551.getClass(), "skillEffect", 804113142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewRecord", argTypes, term52551, args);
    }

};


