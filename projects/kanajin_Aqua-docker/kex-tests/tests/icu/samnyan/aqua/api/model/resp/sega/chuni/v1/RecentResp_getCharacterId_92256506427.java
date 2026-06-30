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

public class RecentResp_getCharacterId_92256506427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52759;

    public RecentResp_getCharacterId_92256506427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52759 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52760 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52761 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52765 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52770 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52771 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52775 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52761, term52761.getClass(), "year", 2010);
        setShortField(term52761, term52761.getClass(), "month", (short) 7);
        setShortField(term52761, term52761.getClass(), "day", (short) 15);
        setField(term52760, term52760.getClass(), "date", term52761);
        setByteField(term52765, term52765.getClass(), "hour", (byte) 10);
        setByteField(term52765, term52765.getClass(), "minute", (byte) 47);
        setByteField(term52765, term52765.getClass(), "second", (byte) 0);
        setIntField(term52765, term52765.getClass(), "nano", 513170187);
        setField(term52760, term52760.getClass(), "time", term52765);
        setField(term52759, term52759.getClass(), "playDate", term52760);
        setIntField(term52771, term52771.getClass(), "year", 2022);
        setShortField(term52771, term52771.getClass(), "month", (short) 3);
        setShortField(term52771, term52771.getClass(), "day", (short) 1);
        setField(term52770, term52770.getClass(), "date", term52771);
        setByteField(term52775, term52775.getClass(), "hour", (byte) 15);
        setByteField(term52775, term52775.getClass(), "minute", (byte) 32);
        setByteField(term52775, term52775.getClass(), "second", (byte) 30);
        setIntField(term52775, term52775.getClass(), "nano", 406959223);
        setField(term52770, term52770.getClass(), "time", term52775);
        setField(term52759, term52759.getClass(), "userPlayDate", term52770);
        setIntField(term52759, term52759.getClass(), "musicId", 1959598890);
        setIntField(term52759, term52759.getClass(), "level", -920963609);
        setIntField(term52759, term52759.getClass(), "customId", -724930680);
        setIntField(term52759, term52759.getClass(), "playedCustom1", -1859413089);
        setIntField(term52759, term52759.getClass(), "playedCustom2", -288823387);
        setIntField(term52759, term52759.getClass(), "playedCustom3", 1565022809);
        setIntField(term52759, term52759.getClass(), "track", 286088345);
        setIntField(term52759, term52759.getClass(), "score", -1958895309);
        setIntField(term52759, term52759.getClass(), "rank", -639022235);
        setIntField(term52759, term52759.getClass(), "maxCombo", -1063872965);
        setIntField(term52759, term52759.getClass(), "maxChain", 804907633);
        setIntField(term52759, term52759.getClass(), "rateTap", -937521678);
        setIntField(term52759, term52759.getClass(), "rateHold", 194707851);
        setIntField(term52759, term52759.getClass(), "rateSlide", 806877632);
        setIntField(term52759, term52759.getClass(), "rateAir", -1198681384);
        setIntField(term52759, term52759.getClass(), "rateFlick", 1224777627);
        setIntField(term52759, term52759.getClass(), "judgeGuilty", -1771549367);
        setIntField(term52759, term52759.getClass(), "judgeAttack", -83563931);
        setIntField(term52759, term52759.getClass(), "judgeJustice", 1175147923);
        setIntField(term52759, term52759.getClass(), "judgeCritical", -1424244263);
        setIntField(term52759, term52759.getClass(), "playerRating", 808665285);
        setBooleanField(term52759, term52759.getClass(), "isNewRecord", true);
        setBooleanField(term52759, term52759.getClass(), "isFullCombo", false);
        setIntField(term52759, term52759.getClass(), "fullChainKind", 2003642877);
        setBooleanField(term52759, term52759.getClass(), "isAllJustice", false);
        setIntField(term52759, term52759.getClass(), "characterId", -1574456346);
        setIntField(term52759, term52759.getClass(), "skillId", 638598511);
        setIntField(term52759, term52759.getClass(), "playKind", -946663870);
        setBooleanField(term52759, term52759.getClass(), "isClear", true);
        setIntField(term52759, term52759.getClass(), "skillLevel", 1997126409);
        setIntField(term52759, term52759.getClass(), "skillEffect", 1794793561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term52759, args);
    }

};


