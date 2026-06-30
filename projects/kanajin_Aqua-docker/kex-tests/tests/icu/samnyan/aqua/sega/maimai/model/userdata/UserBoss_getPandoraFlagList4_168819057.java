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

public class UserBoss_getPandoraFlagList4_168819057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90865;

    public UserBoss_getPandoraFlagList4_168819057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90871 = new Long(-8469818909085103606L);
        term90865 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term90867 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term90869 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term90885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90890 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90900 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term90865, term90865.getClass(), "id", 2777168805269959396L);
        setLongField(term90867, term90867.getClass(), "id", 5255768275907389358L);
        setLongField(term90869, term90869.getClass(), "id", -8859332911664940963L);
        setField(term90869, term90869.getClass(), "extId", term90871);
        setField(term90869, term90869.getClass(), "luid", "tUKcXglBlG");
        setIntField(term90886, term90886.getClass(), "year", 2023);
        setShortField(term90886, term90886.getClass(), "month", (short) 12);
        setShortField(term90886, term90886.getClass(), "day", (short) 5);
        setField(term90885, term90885.getClass(), "date", term90886);
        setByteField(term90890, term90890.getClass(), "hour", (byte) 4);
        setByteField(term90890, term90890.getClass(), "minute", (byte) 10);
        setByteField(term90890, term90890.getClass(), "second", (byte) 41);
        setIntField(term90890, term90890.getClass(), "nano", 40865943);
        setField(term90885, term90885.getClass(), "time", term90890);
        setField(term90869, term90869.getClass(), "registerTime", term90885);
        setIntField(term90896, term90896.getClass(), "year", 2027);
        setShortField(term90896, term90896.getClass(), "month", (short) 10);
        setShortField(term90896, term90896.getClass(), "day", (short) 18);
        setField(term90895, term90895.getClass(), "date", term90896);
        setByteField(term90900, term90900.getClass(), "hour", (byte) 16);
        setByteField(term90900, term90900.getClass(), "minute", (byte) 8);
        setByteField(term90900, term90900.getClass(), "second", (byte) 28);
        setIntField(term90900, term90900.getClass(), "nano", 268951041);
        setField(term90895, term90895.getClass(), "time", term90900);
        setField(term90869, term90869.getClass(), "accessTime", term90895);
        setField(term90867, term90867.getClass(), "card", term90869);
        setIntField(term90867, term90867.getClass(), "lastDataVersion", -1431321947);
        setField(term90867, term90867.getClass(), "userName", "ZGptycjjRq");
        setIntField(term90867, term90867.getClass(), "point", 1629420340);
        setIntField(term90867, term90867.getClass(), "totalPoint", 1060055367);
        setIntField(term90867, term90867.getClass(), "iconId", 2032052675);
        setIntField(term90867, term90867.getClass(), "nameplateId", 534068484);
        setIntField(term90867, term90867.getClass(), "frameId", 2023775166);
        setIntField(term90867, term90867.getClass(), "trophyId", 2041747664);
        setIntField(term90867, term90867.getClass(), "playCount", -55507174);
        setIntField(term90867, term90867.getClass(), "playVsCount", 1686211970);
        setIntField(term90867, term90867.getClass(), "playSyncCount", -1718965606);
        setIntField(term90867, term90867.getClass(), "winCount", 1584286085);
        setIntField(term90867, term90867.getClass(), "helpCount", 1829584257);
        setIntField(term90867, term90867.getClass(), "comboCount", -1981265348);
        setIntField(term90867, term90867.getClass(), "feverCount", -1586349939);
        setIntField(term90867, term90867.getClass(), "totalHiScore", -2147257341);
        setIntField(term90867, term90867.getClass(), "totalEasyHighScore", -295336805);
        setIntField(term90867, term90867.getClass(), "totalBasicHighScore", -752400077);
        setIntField(term90867, term90867.getClass(), "totalAdvancedHighScore", 1527625114);
        setIntField(term90867, term90867.getClass(), "totalExpertHighScore", -824285797);
        setIntField(term90867, term90867.getClass(), "totalMasterHighScore", -1919566665);
        setIntField(term90867, term90867.getClass(), "totalReMasterHighScore", 527364928);
        setIntField(term90867, term90867.getClass(), "totalHighSync", -52905236);
        setIntField(term90867, term90867.getClass(), "totalEasySync", 1652428393);
        setIntField(term90867, term90867.getClass(), "totalBasicSync", -1884232363);
        setIntField(term90867, term90867.getClass(), "totalAdvancedSync", -1687662011);
        setIntField(term90867, term90867.getClass(), "totalExpertSync", -1841656072);
        setIntField(term90867, term90867.getClass(), "totalMasterSync", 475913381);
        setIntField(term90867, term90867.getClass(), "totalReMasterSync", -200214552);
        setIntField(term90867, term90867.getClass(), "playerRating", 87117477);
        setIntField(term90867, term90867.getClass(), "highestRating", -871200798);
        setIntField(term90867, term90867.getClass(), "rankAuthTailId", 5339448);
        setField(term90867, term90867.getClass(), "eventWatchedDate", "kXJaxapFer");
        setField(term90867, term90867.getClass(), "webLimitDate", "OEeAVwVwuj");
        setIntField(term90867, term90867.getClass(), "challengeTrackPhase", -1354552611);
        setIntField(term90867, term90867.getClass(), "firstPlayBits", 1188745205);
        setField(term90867, term90867.getClass(), "lastPlayDate", "WEgFuDZsxi");
        setIntField(term90867, term90867.getClass(), "lastPlaceId", 1472049184);
        setField(term90867, term90867.getClass(), "lastPlaceName", "kvcaSGNTHd");
        setIntField(term90867, term90867.getClass(), "lastRegionId", 1392982418);
        setField(term90867, term90867.getClass(), "lastRegionName", "opXkGeBDoI");
        setField(term90867, term90867.getClass(), "lastClientId", "UHxidCtatV");
        setField(term90867, term90867.getClass(), "lastCountryCode", "LRzADDSjVT");
        setIntField(term90867, term90867.getClass(), "eventPoint", -1572413221);
        setIntField(term90867, term90867.getClass(), "totalLv", -774130445);
        setIntField(term90867, term90867.getClass(), "lastLoginBonusDay", 1186959709);
        setIntField(term90867, term90867.getClass(), "lastSurvivalBonusDay", 627006138);
        setIntField(term90867, term90867.getClass(), "loginBonusLv", 473286732);
        setField(term90865, term90865.getClass(), "user", term90867);
        setLongField(term90865, term90865.getClass(), "pandoraFlagList0", 7048544371106200955L);
        setLongField(term90865, term90865.getClass(), "pandoraFlagList1", -6299955839293054069L);
        setLongField(term90865, term90865.getClass(), "pandoraFlagList2", 3573273176206440433L);
        setLongField(term90865, term90865.getClass(), "pandoraFlagList3", 8242382965219431687L);
        setLongField(term90865, term90865.getClass(), "pandoraFlagList4", -3092537062189928451L);
        setLongField(term90865, term90865.getClass(), "pandoraFlagList5", -6645699856048951433L);
        setLongField(term90865, term90865.getClass(), "pandoraFlagList6", -1721083210597101555L);
        setLongField(term90865, term90865.getClass(), "emblemFlagList", 937792282597213200L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPandoraFlagList4", argTypes, term90865, args);
    }

};


