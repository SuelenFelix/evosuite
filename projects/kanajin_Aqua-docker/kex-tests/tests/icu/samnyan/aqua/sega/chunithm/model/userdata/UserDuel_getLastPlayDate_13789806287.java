package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserDuel_getLastPlayDate_13789806287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77959;

    public UserDuel_getLastPlayDate_13789806287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term77965 = new Long(8034714140377562739L);
        term77959 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term77961 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term77963 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term77979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78016 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78125 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78171 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78246 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term77959, term77959.getClass(), "id", -313071413817626779L);
        setLongField(term77961, term77961.getClass(), "id", -460099854831988621L);
        setLongField(term77963, term77963.getClass(), "id", 8567604378841612757L);
        setField(term77963, term77963.getClass(), "extId", term77965);
        setField(term77963, term77963.getClass(), "luid", "gMFGfpbPZE");
        setIntField(term77980, term77980.getClass(), "year", 2028);
        setShortField(term77980, term77980.getClass(), "month", (short) 4);
        setShortField(term77980, term77980.getClass(), "day", (short) 5);
        setField(term77979, term77979.getClass(), "date", term77980);
        setByteField(term77984, term77984.getClass(), "hour", (byte) 14);
        setByteField(term77984, term77984.getClass(), "minute", (byte) 57);
        setByteField(term77984, term77984.getClass(), "second", (byte) 16);
        setIntField(term77984, term77984.getClass(), "nano", 963050998);
        setField(term77979, term77979.getClass(), "time", term77984);
        setField(term77963, term77963.getClass(), "registerTime", term77979);
        setIntField(term77990, term77990.getClass(), "year", 2027);
        setShortField(term77990, term77990.getClass(), "month", (short) 12);
        setShortField(term77990, term77990.getClass(), "day", (short) 25);
        setField(term77989, term77989.getClass(), "date", term77990);
        setByteField(term77994, term77994.getClass(), "hour", (byte) 19);
        setByteField(term77994, term77994.getClass(), "minute", (byte) 4);
        setByteField(term77994, term77994.getClass(), "second", (byte) 19);
        setIntField(term77994, term77994.getClass(), "nano", 237686859);
        setField(term77989, term77989.getClass(), "time", term77994);
        setField(term77963, term77963.getClass(), "accessTime", term77989);
        setField(term77961, term77961.getClass(), "card", term77963);
        setField(term77961, term77961.getClass(), "userName", "QcfydYbOGP");
        setIntField(term78012, term78012.getClass(), "year", 2025);
        setShortField(term78012, term78012.getClass(), "month", (short) 2);
        setShortField(term78012, term78012.getClass(), "day", (short) 11);
        setField(term78011, term78011.getClass(), "date", term78012);
        setByteField(term78016, term78016.getClass(), "hour", (byte) 22);
        setByteField(term78016, term78016.getClass(), "minute", (byte) 56);
        setByteField(term78016, term78016.getClass(), "second", (byte) 10);
        setIntField(term78016, term78016.getClass(), "nano", 94699593);
        setField(term78011, term78011.getClass(), "time", term78016);
        setField(term77961, term77961.getClass(), "lastLoginDate", term78011);
        setBooleanField(term77961, term77961.getClass(), "isWebJoin", true);
        setField(term77961, term77961.getClass(), "webLimitDate", "FdMzwKizAk");
        setIntField(term77961, term77961.getClass(), "level", -51203093);
        setIntField(term77961, term77961.getClass(), "reincarnationNum", 950494826);
        setField(term77961, term77961.getClass(), "exp", "jjwHVTqCkP");
        setLongField(term77961, term77961.getClass(), "point", 4248644875418274020L);
        setLongField(term77961, term77961.getClass(), "totalPoint", 2220195077881026021L);
        setIntField(term77961, term77961.getClass(), "playCount", 364244181);
        setIntField(term77961, term77961.getClass(), "multiPlayCount", -181128819);
        setIntField(term77961, term77961.getClass(), "multiWinCount", 1578870716);
        setIntField(term77961, term77961.getClass(), "requestResCount", 170089904);
        setIntField(term77961, term77961.getClass(), "acceptResCount", 1115214841);
        setIntField(term77961, term77961.getClass(), "successResCount", -161656545);
        setIntField(term77961, term77961.getClass(), "playerRating", 1569649652);
        setIntField(term77961, term77961.getClass(), "highestRating", 1224092165);
        setIntField(term77961, term77961.getClass(), "nameplateId", 286266173);
        setIntField(term77961, term77961.getClass(), "frameId", 524985992);
        setIntField(term77961, term77961.getClass(), "characterId", 1329035477);
        setIntField(term77961, term77961.getClass(), "trophyId", 479749926);
        setIntField(term77961, term77961.getClass(), "playedTutorialBit", -23214369);
        setIntField(term77961, term77961.getClass(), "firstTutorialCancelNum", 1687480678);
        setIntField(term77961, term77961.getClass(), "masterTutorialCancelNum", 722649363);
        setIntField(term77961, term77961.getClass(), "totalRepertoireCount", 76618777);
        setIntField(term77961, term77961.getClass(), "totalMapNum", 1705792936);
        setLongField(term77961, term77961.getClass(), "totalHiScore", -613788131903895980L);
        setLongField(term77961, term77961.getClass(), "totalBasicHighScore", -5544764664016667081L);
        setLongField(term77961, term77961.getClass(), "totalAdvancedHighScore", 2228513255568046812L);
        setLongField(term77961, term77961.getClass(), "totalExpertHighScore", -640045267052655713L);
        setLongField(term77961, term77961.getClass(), "totalMasterHighScore", -2692345938390249037L);
        setIntField(term78073, term78073.getClass(), "year", 2023);
        setShortField(term78073, term78073.getClass(), "month", (short) 2);
        setShortField(term78073, term78073.getClass(), "day", (short) 6);
        setField(term78072, term78072.getClass(), "date", term78073);
        setByteField(term78077, term78077.getClass(), "hour", (byte) 13);
        setByteField(term78077, term78077.getClass(), "minute", (byte) 35);
        setByteField(term78077, term78077.getClass(), "second", (byte) 14);
        setIntField(term78077, term78077.getClass(), "nano", 917848995);
        setField(term78072, term78072.getClass(), "time", term78077);
        setField(term77961, term77961.getClass(), "eventWatchedDate", term78072);
        setIntField(term77961, term77961.getClass(), "friendCount", -1909996617);
        setBooleanField(term77961, term77961.getClass(), "isMaimai", true);
        setField(term77961, term77961.getClass(), "firstGameId", "uUAkxSFPyL");
        setField(term77961, term77961.getClass(), "firstRomVersion", "XfzbAdTaCO");
        setField(term77961, term77961.getClass(), "firstDataVersion", "rDcGfVDmsE");
        setIntField(term78121, term78121.getClass(), "year", 2016);
        setShortField(term78121, term78121.getClass(), "month", (short) 5);
        setShortField(term78121, term78121.getClass(), "day", (short) 5);
        setField(term78120, term78120.getClass(), "date", term78121);
        setByteField(term78125, term78125.getClass(), "hour", (byte) 17);
        setByteField(term78125, term78125.getClass(), "minute", (byte) 12);
        setByteField(term78125, term78125.getClass(), "second", (byte) 48);
        setIntField(term78125, term78125.getClass(), "nano", 651546858);
        setField(term78120, term78120.getClass(), "time", term78125);
        setField(term77961, term77961.getClass(), "firstPlayDate", term78120);
        setField(term77961, term77961.getClass(), "lastGameId", "agspBqCjgG");
        setField(term77961, term77961.getClass(), "lastRomVersion", "HMJaeNiTNW");
        setField(term77961, term77961.getClass(), "lastDataVersion", "ggcJNlLcZb");
        setIntField(term78167, term78167.getClass(), "year", 2025);
        setShortField(term78167, term78167.getClass(), "month", (short) 1);
        setShortField(term78167, term78167.getClass(), "day", (short) 28);
        setField(term78166, term78166.getClass(), "date", term78167);
        setByteField(term78171, term78171.getClass(), "hour", (byte) 5);
        setByteField(term78171, term78171.getClass(), "minute", (byte) 55);
        setByteField(term78171, term78171.getClass(), "second", (byte) 9);
        setIntField(term78171, term78171.getClass(), "nano", 554633353);
        setField(term78166, term78166.getClass(), "time", term78171);
        setField(term77961, term77961.getClass(), "lastPlayDate", term78166);
        setIntField(term77961, term77961.getClass(), "lastPlaceId", -190426986);
        setField(term77961, term77961.getClass(), "lastPlaceName", "EzhvjUZCQP");
        setField(term77961, term77961.getClass(), "lastRegionId", "FTHebphiPR");
        setField(term77961, term77961.getClass(), "lastRegionName", "OQjMPmyJQz");
        setField(term77961, term77961.getClass(), "lastAllNetId", "FZQimBsMNt");
        setField(term77961, term77961.getClass(), "lastClientId", "lowANLpXCV");
        setField(term77959, term77959.getClass(), "user", term77961);
        setIntField(term77959, term77959.getClass(), "duelId", -555983707);
        setIntField(term77959, term77959.getClass(), "progress", -606116015);
        setIntField(term77959, term77959.getClass(), "point", -181890457);
        setBooleanField(term77959, term77959.getClass(), "isClear", true);
        setIntField(term78242, term78242.getClass(), "year", 2016);
        setShortField(term78242, term78242.getClass(), "month", (short) 4);
        setShortField(term78242, term78242.getClass(), "day", (short) 6);
        setField(term78241, term78241.getClass(), "date", term78242);
        setByteField(term78246, term78246.getClass(), "hour", (byte) 11);
        setByteField(term78246, term78246.getClass(), "minute", (byte) 33);
        setByteField(term78246, term78246.getClass(), "second", (byte) 12);
        setIntField(term78246, term78246.getClass(), "nano", 167392252);
        setField(term78241, term78241.getClass(), "time", term78246);
        setField(term77959, term77959.getClass(), "lastPlayDate", term78241);
        setIntField(term77959, term77959.getClass(), "param1", -944465027);
        setIntField(term77959, term77959.getClass(), "param2", 378932740);
        setIntField(term77959, term77959.getClass(), "param3", -346858205);
        setIntField(term77959, term77959.getClass(), "param4", -1490019542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term77959, args);
    }

};


