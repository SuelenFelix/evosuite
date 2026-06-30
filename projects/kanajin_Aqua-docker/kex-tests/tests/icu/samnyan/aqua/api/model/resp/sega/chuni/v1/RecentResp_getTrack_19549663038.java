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

public class RecentResp_getTrack_19549663038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51771;

    public RecentResp_getTrack_19549663038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51771 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51772 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51773 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51777 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51787 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51773, term51773.getClass(), "year", 2027);
        setShortField(term51773, term51773.getClass(), "month", (short) 1);
        setShortField(term51773, term51773.getClass(), "day", (short) 12);
        setField(term51772, term51772.getClass(), "date", term51773);
        setByteField(term51777, term51777.getClass(), "hour", (byte) 12);
        setByteField(term51777, term51777.getClass(), "minute", (byte) 12);
        setByteField(term51777, term51777.getClass(), "second", (byte) 21);
        setIntField(term51777, term51777.getClass(), "nano", 77791222);
        setField(term51772, term51772.getClass(), "time", term51777);
        setField(term51771, term51771.getClass(), "playDate", term51772);
        setIntField(term51783, term51783.getClass(), "year", 2018);
        setShortField(term51783, term51783.getClass(), "month", (short) 8);
        setShortField(term51783, term51783.getClass(), "day", (short) 2);
        setField(term51782, term51782.getClass(), "date", term51783);
        setByteField(term51787, term51787.getClass(), "hour", (byte) 20);
        setByteField(term51787, term51787.getClass(), "minute", (byte) 18);
        setByteField(term51787, term51787.getClass(), "second", (byte) 22);
        setIntField(term51787, term51787.getClass(), "nano", 639407296);
        setField(term51782, term51782.getClass(), "time", term51787);
        setField(term51771, term51771.getClass(), "userPlayDate", term51782);
        setIntField(term51771, term51771.getClass(), "musicId", -552245510);
        setIntField(term51771, term51771.getClass(), "level", 1590263959);
        setIntField(term51771, term51771.getClass(), "customId", -203971814);
        setIntField(term51771, term51771.getClass(), "playedCustom1", -786856127);
        setIntField(term51771, term51771.getClass(), "playedCustom2", 891987554);
        setIntField(term51771, term51771.getClass(), "playedCustom3", 407640701);
        setIntField(term51771, term51771.getClass(), "track", -55858757);
        setIntField(term51771, term51771.getClass(), "score", 1101065297);
        setIntField(term51771, term51771.getClass(), "rank", -110542660);
        setIntField(term51771, term51771.getClass(), "maxCombo", 1430629000);
        setIntField(term51771, term51771.getClass(), "maxChain", -1684627375);
        setIntField(term51771, term51771.getClass(), "rateTap", -74479819);
        setIntField(term51771, term51771.getClass(), "rateHold", -1610494666);
        setIntField(term51771, term51771.getClass(), "rateSlide", 564476854);
        setIntField(term51771, term51771.getClass(), "rateAir", 963238257);
        setIntField(term51771, term51771.getClass(), "rateFlick", 1819563159);
        setIntField(term51771, term51771.getClass(), "judgeGuilty", -131038479);
        setIntField(term51771, term51771.getClass(), "judgeAttack", 1690337049);
        setIntField(term51771, term51771.getClass(), "judgeJustice", 254984950);
        setIntField(term51771, term51771.getClass(), "judgeCritical", 491595035);
        setIntField(term51771, term51771.getClass(), "playerRating", 2111929590);
        setBooleanField(term51771, term51771.getClass(), "isNewRecord", false);
        setBooleanField(term51771, term51771.getClass(), "isFullCombo", true);
        setIntField(term51771, term51771.getClass(), "fullChainKind", 1984033465);
        setBooleanField(term51771, term51771.getClass(), "isAllJustice", false);
        setIntField(term51771, term51771.getClass(), "characterId", 415386900);
        setIntField(term51771, term51771.getClass(), "skillId", -80119579);
        setIntField(term51771, term51771.getClass(), "playKind", -725563031);
        setBooleanField(term51771, term51771.getClass(), "isClear", false);
        setIntField(term51771, term51771.getClass(), "skillLevel", 228070072);
        setIntField(term51771, term51771.getClass(), "skillEffect", 1918578349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrack", argTypes, term51771, args);
    }

};


