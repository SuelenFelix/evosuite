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

public class UserMusicDetail_getId_3668100421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180193;

    public UserMusicDetail_getId_3668100421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term180199 = new Long(-143609946830350439L);
        term180193 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term180195 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term180197 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term180213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180218 = newInstance(Class.forName("java.time.LocalTime"));
        Object term180223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180228 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term180193, term180193.getClass(), "id", -7262010620280836353L);
        setLongField(term180195, term180195.getClass(), "id", -7722734066534066354L);
        setLongField(term180197, term180197.getClass(), "id", -644547147296685723L);
        setField(term180197, term180197.getClass(), "extId", term180199);
        setField(term180197, term180197.getClass(), "luid", "gyeAErvtXb");
        setIntField(term180214, term180214.getClass(), "year", 2011);
        setShortField(term180214, term180214.getClass(), "month", (short) 7);
        setShortField(term180214, term180214.getClass(), "day", (short) 18);
        setField(term180213, term180213.getClass(), "date", term180214);
        setByteField(term180218, term180218.getClass(), "hour", (byte) 1);
        setByteField(term180218, term180218.getClass(), "minute", (byte) 38);
        setByteField(term180218, term180218.getClass(), "second", (byte) 1);
        setIntField(term180218, term180218.getClass(), "nano", 146335870);
        setField(term180213, term180213.getClass(), "time", term180218);
        setField(term180197, term180197.getClass(), "registerTime", term180213);
        setIntField(term180224, term180224.getClass(), "year", 2020);
        setShortField(term180224, term180224.getClass(), "month", (short) 5);
        setShortField(term180224, term180224.getClass(), "day", (short) 30);
        setField(term180223, term180223.getClass(), "date", term180224);
        setByteField(term180228, term180228.getClass(), "hour", (byte) 9);
        setByteField(term180228, term180228.getClass(), "minute", (byte) 45);
        setByteField(term180228, term180228.getClass(), "second", (byte) 37);
        setIntField(term180228, term180228.getClass(), "nano", 806796729);
        setField(term180223, term180223.getClass(), "time", term180228);
        setField(term180197, term180197.getClass(), "accessTime", term180223);
        setField(term180195, term180195.getClass(), "card", term180197);
        setIntField(term180195, term180195.getClass(), "lastDataVersion", 713233511);
        setField(term180195, term180195.getClass(), "userName", "IEsZEVbFZG");
        setIntField(term180195, term180195.getClass(), "point", -297641207);
        setIntField(term180195, term180195.getClass(), "totalPoint", 2062996672);
        setIntField(term180195, term180195.getClass(), "iconId", -557947409);
        setIntField(term180195, term180195.getClass(), "nameplateId", 752101859);
        setIntField(term180195, term180195.getClass(), "frameId", -226576729);
        setIntField(term180195, term180195.getClass(), "trophyId", -179994666);
        setIntField(term180195, term180195.getClass(), "playCount", -80174742);
        setIntField(term180195, term180195.getClass(), "playVsCount", -1475241591);
        setIntField(term180195, term180195.getClass(), "playSyncCount", -1764596819);
        setIntField(term180195, term180195.getClass(), "winCount", 750223568);
        setIntField(term180195, term180195.getClass(), "helpCount", -1991531539);
        setIntField(term180195, term180195.getClass(), "comboCount", 1177530063);
        setIntField(term180195, term180195.getClass(), "feverCount", -1181476516);
        setIntField(term180195, term180195.getClass(), "totalHiScore", -1534726553);
        setIntField(term180195, term180195.getClass(), "totalEasyHighScore", 838775349);
        setIntField(term180195, term180195.getClass(), "totalBasicHighScore", 1518037348);
        setIntField(term180195, term180195.getClass(), "totalAdvancedHighScore", 1379397119);
        setIntField(term180195, term180195.getClass(), "totalExpertHighScore", 973992572);
        setIntField(term180195, term180195.getClass(), "totalMasterHighScore", 410208528);
        setIntField(term180195, term180195.getClass(), "totalReMasterHighScore", -901430943);
        setIntField(term180195, term180195.getClass(), "totalHighSync", -432301816);
        setIntField(term180195, term180195.getClass(), "totalEasySync", 1644514158);
        setIntField(term180195, term180195.getClass(), "totalBasicSync", 652322335);
        setIntField(term180195, term180195.getClass(), "totalAdvancedSync", -1007191362);
        setIntField(term180195, term180195.getClass(), "totalExpertSync", 328348536);
        setIntField(term180195, term180195.getClass(), "totalMasterSync", -77263189);
        setIntField(term180195, term180195.getClass(), "totalReMasterSync", 2144245980);
        setIntField(term180195, term180195.getClass(), "playerRating", 1954135046);
        setIntField(term180195, term180195.getClass(), "highestRating", 1264654980);
        setIntField(term180195, term180195.getClass(), "rankAuthTailId", -1398439799);
        setField(term180195, term180195.getClass(), "eventWatchedDate", "hefxCEhnuL");
        setField(term180195, term180195.getClass(), "webLimitDate", "nAZCgcAqKF");
        setIntField(term180195, term180195.getClass(), "challengeTrackPhase", -1008803874);
        setIntField(term180195, term180195.getClass(), "firstPlayBits", -1700078514);
        setField(term180195, term180195.getClass(), "lastPlayDate", "qEwUfGEixD");
        setIntField(term180195, term180195.getClass(), "lastPlaceId", -2133469067);
        setField(term180195, term180195.getClass(), "lastPlaceName", "gzwdEqELlU");
        setIntField(term180195, term180195.getClass(), "lastRegionId", -297855658);
        setField(term180195, term180195.getClass(), "lastRegionName", "PVcLgfdPEf");
        setField(term180195, term180195.getClass(), "lastClientId", "PEDTNvvicf");
        setField(term180195, term180195.getClass(), "lastCountryCode", "CoEwWlFbOr");
        setIntField(term180195, term180195.getClass(), "eventPoint", -936602021);
        setIntField(term180195, term180195.getClass(), "totalLv", 1473584227);
        setIntField(term180195, term180195.getClass(), "lastLoginBonusDay", 704067535);
        setIntField(term180195, term180195.getClass(), "lastSurvivalBonusDay", 403828653);
        setIntField(term180195, term180195.getClass(), "loginBonusLv", -1807256081);
        setField(term180193, term180193.getClass(), "user", term180195);
        setIntField(term180193, term180193.getClass(), "musicId", 697319234);
        setIntField(term180193, term180193.getClass(), "level", -372120395);
        setIntField(term180193, term180193.getClass(), "playCount", 1872130059);
        setIntField(term180193, term180193.getClass(), "scoreMax", -1034882917);
        setIntField(term180193, term180193.getClass(), "syncRateMax", -2000144948);
        setBooleanField(term180193, term180193.getClass(), "isAllPerfect", true);
        setIntField(term180193, term180193.getClass(), "isAllPerfectPlus", -1501347701);
        setIntField(term180193, term180193.getClass(), "fullCombo", -1748063839);
        setIntField(term180193, term180193.getClass(), "maxFever", -1557043441);
        setIntField(term180193, term180193.getClass(), "achievement", 567693754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term180193, args);
    }

};


