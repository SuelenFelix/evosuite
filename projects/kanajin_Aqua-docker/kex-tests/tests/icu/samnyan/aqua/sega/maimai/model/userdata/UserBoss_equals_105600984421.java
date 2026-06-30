package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserBoss_equals_105600984421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94983;
     Object term95167;

    public UserBoss_equals_105600984421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94989 = new Long(-3130003589475815807L);
        term94983 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term94985 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term94987 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term95003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95008 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95018 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94983, term94983.getClass(), "id", 9105566407535624519L);
        setLongField(term94985, term94985.getClass(), "id", 8850312777693707693L);
        setLongField(term94987, term94987.getClass(), "id", 1038272501243892514L);
        setField(term94987, term94987.getClass(), "extId", term94989);
        setField(term94987, term94987.getClass(), "luid", "QEoeITwBfz");
        setIntField(term95004, term95004.getClass(), "year", 2019);
        setShortField(term95004, term95004.getClass(), "month", (short) 7);
        setShortField(term95004, term95004.getClass(), "day", (short) 10);
        setField(term95003, term95003.getClass(), "date", term95004);
        setByteField(term95008, term95008.getClass(), "hour", (byte) 4);
        setByteField(term95008, term95008.getClass(), "minute", (byte) 6);
        setByteField(term95008, term95008.getClass(), "second", (byte) 6);
        setIntField(term95008, term95008.getClass(), "nano", 210255351);
        setField(term95003, term95003.getClass(), "time", term95008);
        setField(term94987, term94987.getClass(), "registerTime", term95003);
        setIntField(term95014, term95014.getClass(), "year", 2027);
        setShortField(term95014, term95014.getClass(), "month", (short) 10);
        setShortField(term95014, term95014.getClass(), "day", (short) 8);
        setField(term95013, term95013.getClass(), "date", term95014);
        setByteField(term95018, term95018.getClass(), "hour", (byte) 8);
        setByteField(term95018, term95018.getClass(), "minute", (byte) 53);
        setByteField(term95018, term95018.getClass(), "second", (byte) 13);
        setIntField(term95018, term95018.getClass(), "nano", 464148999);
        setField(term95013, term95013.getClass(), "time", term95018);
        setField(term94987, term94987.getClass(), "accessTime", term95013);
        setField(term94985, term94985.getClass(), "card", term94987);
        setIntField(term94985, term94985.getClass(), "lastDataVersion", 375758346);
        setField(term94985, term94985.getClass(), "userName", "rWOKjAUIvS");
        setIntField(term94985, term94985.getClass(), "point", 128390500);
        setIntField(term94985, term94985.getClass(), "totalPoint", 2129617215);
        setIntField(term94985, term94985.getClass(), "iconId", 123578164);
        setIntField(term94985, term94985.getClass(), "nameplateId", 496578261);
        setIntField(term94985, term94985.getClass(), "frameId", -685473621);
        setIntField(term94985, term94985.getClass(), "trophyId", -1507226157);
        setIntField(term94985, term94985.getClass(), "playCount", 2048976325);
        setIntField(term94985, term94985.getClass(), "playVsCount", 1946370960);
        setIntField(term94985, term94985.getClass(), "playSyncCount", -1208286860);
        setIntField(term94985, term94985.getClass(), "winCount", -1558614690);
        setIntField(term94985, term94985.getClass(), "helpCount", -1007231272);
        setIntField(term94985, term94985.getClass(), "comboCount", 616194988);
        setIntField(term94985, term94985.getClass(), "feverCount", 875212303);
        setIntField(term94985, term94985.getClass(), "totalHiScore", -1724746051);
        setIntField(term94985, term94985.getClass(), "totalEasyHighScore", -1978836967);
        setIntField(term94985, term94985.getClass(), "totalBasicHighScore", 223766580);
        setIntField(term94985, term94985.getClass(), "totalAdvancedHighScore", -1028401307);
        setIntField(term94985, term94985.getClass(), "totalExpertHighScore", -749032967);
        setIntField(term94985, term94985.getClass(), "totalMasterHighScore", 399255289);
        setIntField(term94985, term94985.getClass(), "totalReMasterHighScore", -188927419);
        setIntField(term94985, term94985.getClass(), "totalHighSync", 865923167);
        setIntField(term94985, term94985.getClass(), "totalEasySync", 411168220);
        setIntField(term94985, term94985.getClass(), "totalBasicSync", -37027662);
        setIntField(term94985, term94985.getClass(), "totalAdvancedSync", 1314903229);
        setIntField(term94985, term94985.getClass(), "totalExpertSync", 1315243912);
        setIntField(term94985, term94985.getClass(), "totalMasterSync", 1457074887);
        setIntField(term94985, term94985.getClass(), "totalReMasterSync", 1963312777);
        setIntField(term94985, term94985.getClass(), "playerRating", -1162599119);
        setIntField(term94985, term94985.getClass(), "highestRating", -151931152);
        setIntField(term94985, term94985.getClass(), "rankAuthTailId", 14184131);
        setField(term94985, term94985.getClass(), "eventWatchedDate", "IcpfsIGlDf");
        setField(term94985, term94985.getClass(), "webLimitDate", "xCfGcRdHTK");
        setIntField(term94985, term94985.getClass(), "challengeTrackPhase", 357749330);
        setIntField(term94985, term94985.getClass(), "firstPlayBits", 33679397);
        setField(term94985, term94985.getClass(), "lastPlayDate", "KKHQCvKTvF");
        setIntField(term94985, term94985.getClass(), "lastPlaceId", 613527123);
        setField(term94985, term94985.getClass(), "lastPlaceName", "XBhNIIxiNP");
        setIntField(term94985, term94985.getClass(), "lastRegionId", 312461013);
        setField(term94985, term94985.getClass(), "lastRegionName", "JljyXnwkuC");
        setField(term94985, term94985.getClass(), "lastClientId", "XLOxkLyvMY");
        setField(term94985, term94985.getClass(), "lastCountryCode", "pjUyKHjjKH");
        setIntField(term94985, term94985.getClass(), "eventPoint", 1548945209);
        setIntField(term94985, term94985.getClass(), "totalLv", -1537602442);
        setIntField(term94985, term94985.getClass(), "lastLoginBonusDay", -1264895109);
        setIntField(term94985, term94985.getClass(), "lastSurvivalBonusDay", -1573815915);
        setIntField(term94985, term94985.getClass(), "loginBonusLv", -1219777858);
        setField(term94983, term94983.getClass(), "user", term94985);
        setLongField(term94983, term94983.getClass(), "pandoraFlagList0", -5787975575293098129L);
        setLongField(term94983, term94983.getClass(), "pandoraFlagList1", -2214621750590649821L);
        setLongField(term94983, term94983.getClass(), "pandoraFlagList2", -480743639677441412L);
        setLongField(term94983, term94983.getClass(), "pandoraFlagList3", 4618470175243384123L);
        setLongField(term94983, term94983.getClass(), "pandoraFlagList4", 1747819662947425876L);
        setLongField(term94983, term94983.getClass(), "pandoraFlagList5", 8085945615925723302L);
        setLongField(term94983, term94983.getClass(), "pandoraFlagList6", 5874242482849721868L);
        setLongField(term94983, term94983.getClass(), "emblemFlagList", 682045578778432659L);
        term95167 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term95167;
        callMethod(klass, "equals", argTypes, term94983, args);
    }

};


