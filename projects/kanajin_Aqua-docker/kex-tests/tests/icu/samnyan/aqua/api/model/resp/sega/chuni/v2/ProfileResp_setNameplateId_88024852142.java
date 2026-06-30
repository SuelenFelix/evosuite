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
import java.lang.Integer;

public class ProfileResp_setNameplateId_88024852142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119669;
     Object term119744;

    public ProfileResp_setNameplateId_88024852142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119669 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119717 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119727 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119669, term119669.getClass(), "userName", "PQHyujWLlL");
        setIntField(term119669, term119669.getClass(), "level", -1650563192);
        setField(term119669, term119669.getClass(), "exp", "UEKVADcZqS");
        setLongField(term119669, term119669.getClass(), "point", -6445201902102343423L);
        setLongField(term119669, term119669.getClass(), "totalPoint", 1454316596500911577L);
        setIntField(term119669, term119669.getClass(), "playCount", -1920629297);
        setIntField(term119669, term119669.getClass(), "playerRating", -558254541);
        setIntField(term119669, term119669.getClass(), "highestRating", 867589464);
        setIntField(term119669, term119669.getClass(), "nameplateId", 431739307);
        setIntField(term119669, term119669.getClass(), "frameId", -783663329);
        setIntField(term119669, term119669.getClass(), "characterId", -834251854);
        setIntField(term119669, term119669.getClass(), "trophyId", -1284728828);
        setIntField(term119669, term119669.getClass(), "totalMapNum", 2018220830);
        setLongField(term119669, term119669.getClass(), "totalHiScore", -2111542580361798016L);
        setLongField(term119669, term119669.getClass(), "totalBasicHighScore", 2057875774041820508L);
        setLongField(term119669, term119669.getClass(), "totalAdvancedHighScore", 1156903350966631617L);
        setLongField(term119669, term119669.getClass(), "totalExpertHighScore", -8354491077748222406L);
        setLongField(term119669, term119669.getClass(), "totalMasterHighScore", -6434345679586157129L);
        setLongField(term119669, term119669.getClass(), "totalUltimaHighScore", 3290723342049781600L);
        setIntField(term119669, term119669.getClass(), "friendCount", -1289697993);
        setIntField(term119713, term119713.getClass(), "year", 2015);
        setShortField(term119713, term119713.getClass(), "month", (short) 5);
        setShortField(term119713, term119713.getClass(), "day", (short) 5);
        setField(term119712, term119712.getClass(), "date", term119713);
        setByteField(term119717, term119717.getClass(), "hour", (byte) 17);
        setByteField(term119717, term119717.getClass(), "minute", (byte) 30);
        setByteField(term119717, term119717.getClass(), "second", (byte) 32);
        setIntField(term119717, term119717.getClass(), "nano", 944217643);
        setField(term119712, term119712.getClass(), "time", term119717);
        setField(term119669, term119669.getClass(), "firstPlayDate", term119712);
        setIntField(term119723, term119723.getClass(), "year", 2025);
        setShortField(term119723, term119723.getClass(), "month", (short) 5);
        setShortField(term119723, term119723.getClass(), "day", (short) 20);
        setField(term119722, term119722.getClass(), "date", term119723);
        setByteField(term119727, term119727.getClass(), "hour", (byte) 23);
        setByteField(term119727, term119727.getClass(), "minute", (byte) 49);
        setByteField(term119727, term119727.getClass(), "second", (byte) 21);
        setIntField(term119727, term119727.getClass(), "nano", 219850999);
        setField(term119722, term119722.getClass(), "time", term119727);
        setField(term119669, term119669.getClass(), "lastPlayDate", term119722);
        setIntField(term119669, term119669.getClass(), "courseClass", 1677270934);
        setIntField(term119669, term119669.getClass(), "overPowerPoint", -328187892);
        setIntField(term119669, term119669.getClass(), "overPowerRate", 1831150329);
        setIntField(term119669, term119669.getClass(), "mapIconId", 606935686);
        setIntField(term119669, term119669.getClass(), "voiceId", 1042714813);
        setIntField(term119669, term119669.getClass(), "avatarWear", -1492112606);
        setIntField(term119669, term119669.getClass(), "avatarHead", 1994737867);
        setIntField(term119669, term119669.getClass(), "avatarFace", 917195497);
        setIntField(term119669, term119669.getClass(), "avatarSkin", 2049008283);
        setIntField(term119669, term119669.getClass(), "avatarItem", -731035941);
        setIntField(term119669, term119669.getClass(), "avatarFront", 718861993);
        setIntField(term119669, term119669.getClass(), "avatarBack", -884330966);
        term119744 = new Integer(-665714832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term119744;
        callMethod(klass, "setNameplateId", argTypes, term119669, args);
    }

};


