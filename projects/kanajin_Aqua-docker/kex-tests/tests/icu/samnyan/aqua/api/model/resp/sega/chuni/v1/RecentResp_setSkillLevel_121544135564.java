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
import java.lang.Integer;

public class RecentResp_setSkillLevel_121544135564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54761;
     Object term54813;

    public RecentResp_setSkillLevel_121544135564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54761 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54767 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54772 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54773 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54777 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54763, term54763.getClass(), "year", 2011);
        setShortField(term54763, term54763.getClass(), "month", (short) 4);
        setShortField(term54763, term54763.getClass(), "day", (short) 30);
        setField(term54762, term54762.getClass(), "date", term54763);
        setByteField(term54767, term54767.getClass(), "hour", (byte) 5);
        setByteField(term54767, term54767.getClass(), "minute", (byte) 2);
        setByteField(term54767, term54767.getClass(), "second", (byte) 59);
        setIntField(term54767, term54767.getClass(), "nano", 800923694);
        setField(term54762, term54762.getClass(), "time", term54767);
        setField(term54761, term54761.getClass(), "playDate", term54762);
        setIntField(term54773, term54773.getClass(), "year", 2027);
        setShortField(term54773, term54773.getClass(), "month", (short) 5);
        setShortField(term54773, term54773.getClass(), "day", (short) 8);
        setField(term54772, term54772.getClass(), "date", term54773);
        setByteField(term54777, term54777.getClass(), "hour", (byte) 4);
        setByteField(term54777, term54777.getClass(), "minute", (byte) 0);
        setByteField(term54777, term54777.getClass(), "second", (byte) 19);
        setIntField(term54777, term54777.getClass(), "nano", 400713347);
        setField(term54772, term54772.getClass(), "time", term54777);
        setField(term54761, term54761.getClass(), "userPlayDate", term54772);
        setIntField(term54761, term54761.getClass(), "musicId", 1141630209);
        setIntField(term54761, term54761.getClass(), "level", -1809659280);
        setIntField(term54761, term54761.getClass(), "customId", 2076646471);
        setIntField(term54761, term54761.getClass(), "playedCustom1", -63936889);
        setIntField(term54761, term54761.getClass(), "playedCustom2", 1893773732);
        setIntField(term54761, term54761.getClass(), "playedCustom3", -1854658170);
        setIntField(term54761, term54761.getClass(), "track", -383472550);
        setIntField(term54761, term54761.getClass(), "score", 1184946577);
        setIntField(term54761, term54761.getClass(), "rank", 1076103120);
        setIntField(term54761, term54761.getClass(), "maxCombo", 414965503);
        setIntField(term54761, term54761.getClass(), "maxChain", -42540264);
        setIntField(term54761, term54761.getClass(), "rateTap", -179532327);
        setIntField(term54761, term54761.getClass(), "rateHold", 1282999015);
        setIntField(term54761, term54761.getClass(), "rateSlide", 1957459536);
        setIntField(term54761, term54761.getClass(), "rateAir", 1523266697);
        setIntField(term54761, term54761.getClass(), "rateFlick", 487116383);
        setIntField(term54761, term54761.getClass(), "judgeGuilty", 968755800);
        setIntField(term54761, term54761.getClass(), "judgeAttack", 1491289140);
        setIntField(term54761, term54761.getClass(), "judgeJustice", 424804018);
        setIntField(term54761, term54761.getClass(), "judgeCritical", 835463182);
        setIntField(term54761, term54761.getClass(), "playerRating", -1730193267);
        setBooleanField(term54761, term54761.getClass(), "isNewRecord", true);
        setBooleanField(term54761, term54761.getClass(), "isFullCombo", false);
        setIntField(term54761, term54761.getClass(), "fullChainKind", 434941375);
        setBooleanField(term54761, term54761.getClass(), "isAllJustice", true);
        setIntField(term54761, term54761.getClass(), "characterId", 1467794711);
        setIntField(term54761, term54761.getClass(), "skillId", -491366166);
        setIntField(term54761, term54761.getClass(), "playKind", 1410370567);
        setBooleanField(term54761, term54761.getClass(), "isClear", false);
        setIntField(term54761, term54761.getClass(), "skillLevel", 2136820914);
        setIntField(term54761, term54761.getClass(), "skillEffect", -1698291583);
        term54813 = new Integer(-246710651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54813;
        callMethod(klass, "setSkillLevel", argTypes, term54761, args);
    }

};


