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

public class RecentResp_getRank_184513345910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46705;

    public RecentResp_getRank_184513345910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46705 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46706 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46707 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46711 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46716 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46717 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46721 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46707, term46707.getClass(), "year", 2011);
        setShortField(term46707, term46707.getClass(), "month", (short) 10);
        setShortField(term46707, term46707.getClass(), "day", (short) 20);
        setField(term46706, term46706.getClass(), "date", term46707);
        setByteField(term46711, term46711.getClass(), "hour", (byte) 2);
        setByteField(term46711, term46711.getClass(), "minute", (byte) 15);
        setByteField(term46711, term46711.getClass(), "second", (byte) 4);
        setIntField(term46711, term46711.getClass(), "nano", 46300192);
        setField(term46706, term46706.getClass(), "time", term46711);
        setField(term46705, term46705.getClass(), "playDate", term46706);
        setIntField(term46717, term46717.getClass(), "year", 2023);
        setShortField(term46717, term46717.getClass(), "month", (short) 3);
        setShortField(term46717, term46717.getClass(), "day", (short) 26);
        setField(term46716, term46716.getClass(), "date", term46717);
        setByteField(term46721, term46721.getClass(), "hour", (byte) 2);
        setByteField(term46721, term46721.getClass(), "minute", (byte) 30);
        setByteField(term46721, term46721.getClass(), "second", (byte) 47);
        setIntField(term46721, term46721.getClass(), "nano", 494050019);
        setField(term46716, term46716.getClass(), "time", term46721);
        setField(term46705, term46705.getClass(), "userPlayDate", term46716);
        setIntField(term46705, term46705.getClass(), "musicId", -918570985);
        setIntField(term46705, term46705.getClass(), "level", 242181753);
        setIntField(term46705, term46705.getClass(), "customId", -1356117545);
        setIntField(term46705, term46705.getClass(), "playedCustom1", -1539896141);
        setIntField(term46705, term46705.getClass(), "playedCustom2", 798480099);
        setIntField(term46705, term46705.getClass(), "playedCustom3", -1624038595);
        setIntField(term46705, term46705.getClass(), "track", 1593619323);
        setIntField(term46705, term46705.getClass(), "score", -232601868);
        setIntField(term46705, term46705.getClass(), "rank", -1743056588);
        setIntField(term46705, term46705.getClass(), "maxCombo", 576646846);
        setIntField(term46705, term46705.getClass(), "maxChain", 916507296);
        setIntField(term46705, term46705.getClass(), "rateTap", 1307887729);
        setIntField(term46705, term46705.getClass(), "rateHold", 1628336669);
        setIntField(term46705, term46705.getClass(), "rateSlide", 466807421);
        setIntField(term46705, term46705.getClass(), "rateAir", -407675703);
        setIntField(term46705, term46705.getClass(), "rateFlick", -429960516);
        setIntField(term46705, term46705.getClass(), "judgeGuilty", -630727180);
        setIntField(term46705, term46705.getClass(), "judgeAttack", -1234361060);
        setIntField(term46705, term46705.getClass(), "judgeJustice", -267520884);
        setIntField(term46705, term46705.getClass(), "judgeCritical", 1431716083);
        setIntField(term46705, term46705.getClass(), "playerRating", 1540004680);
        setBooleanField(term46705, term46705.getClass(), "isNewRecord", false);
        setBooleanField(term46705, term46705.getClass(), "isFullCombo", false);
        setIntField(term46705, term46705.getClass(), "fullChainKind", -594861500);
        setBooleanField(term46705, term46705.getClass(), "isAllJustice", false);
        setIntField(term46705, term46705.getClass(), "characterId", 1731562923);
        setIntField(term46705, term46705.getClass(), "skillId", 33467458);
        setIntField(term46705, term46705.getClass(), "playKind", 1729034001);
        setBooleanField(term46705, term46705.getClass(), "isClear", false);
        setIntField(term46705, term46705.getClass(), "skillLevel", 1094810824);
        setIntField(term46705, term46705.getClass(), "skillEffect", -1746471324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRank", argTypes, term46705, args);
    }

};


