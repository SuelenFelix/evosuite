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

public class UserMusicDetail_getSyncRateMax_17755987607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181849;

    public UserMusicDetail_getSyncRateMax_17755987607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term181855 = new Long(-4477377284889705897L);
        term181849 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term181851 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term181853 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term181869 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181870 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181874 = newInstance(Class.forName("java.time.LocalTime"));
        Object term181879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181884 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term181849, term181849.getClass(), "id", 2614185242023314675L);
        setLongField(term181851, term181851.getClass(), "id", 178361842517537670L);
        setLongField(term181853, term181853.getClass(), "id", 8420774984276198981L);
        setField(term181853, term181853.getClass(), "extId", term181855);
        setField(term181853, term181853.getClass(), "luid", "kkVoDibEgl");
        setIntField(term181870, term181870.getClass(), "year", 2017);
        setShortField(term181870, term181870.getClass(), "month", (short) 7);
        setShortField(term181870, term181870.getClass(), "day", (short) 7);
        setField(term181869, term181869.getClass(), "date", term181870);
        setByteField(term181874, term181874.getClass(), "hour", (byte) 12);
        setByteField(term181874, term181874.getClass(), "minute", (byte) 29);
        setByteField(term181874, term181874.getClass(), "second", (byte) 38);
        setIntField(term181874, term181874.getClass(), "nano", 396071426);
        setField(term181869, term181869.getClass(), "time", term181874);
        setField(term181853, term181853.getClass(), "registerTime", term181869);
        setIntField(term181880, term181880.getClass(), "year", 2025);
        setShortField(term181880, term181880.getClass(), "month", (short) 12);
        setShortField(term181880, term181880.getClass(), "day", (short) 4);
        setField(term181879, term181879.getClass(), "date", term181880);
        setByteField(term181884, term181884.getClass(), "hour", (byte) 20);
        setByteField(term181884, term181884.getClass(), "minute", (byte) 48);
        setByteField(term181884, term181884.getClass(), "second", (byte) 37);
        setIntField(term181884, term181884.getClass(), "nano", 178948777);
        setField(term181879, term181879.getClass(), "time", term181884);
        setField(term181853, term181853.getClass(), "accessTime", term181879);
        setField(term181851, term181851.getClass(), "card", term181853);
        setIntField(term181851, term181851.getClass(), "lastDataVersion", 1621299412);
        setField(term181851, term181851.getClass(), "userName", "PLwKYMwKMG");
        setIntField(term181851, term181851.getClass(), "point", -1233674949);
        setIntField(term181851, term181851.getClass(), "totalPoint", -473089145);
        setIntField(term181851, term181851.getClass(), "iconId", 1927045069);
        setIntField(term181851, term181851.getClass(), "nameplateId", 1342865344);
        setIntField(term181851, term181851.getClass(), "frameId", 1182579094);
        setIntField(term181851, term181851.getClass(), "trophyId", 1278779077);
        setIntField(term181851, term181851.getClass(), "playCount", -1832264228);
        setIntField(term181851, term181851.getClass(), "playVsCount", 404180994);
        setIntField(term181851, term181851.getClass(), "playSyncCount", 688092178);
        setIntField(term181851, term181851.getClass(), "winCount", 269040971);
        setIntField(term181851, term181851.getClass(), "helpCount", -1931338777);
        setIntField(term181851, term181851.getClass(), "comboCount", -274597275);
        setIntField(term181851, term181851.getClass(), "feverCount", 256646943);
        setIntField(term181851, term181851.getClass(), "totalHiScore", -1191702228);
        setIntField(term181851, term181851.getClass(), "totalEasyHighScore", 1784726740);
        setIntField(term181851, term181851.getClass(), "totalBasicHighScore", 1427198160);
        setIntField(term181851, term181851.getClass(), "totalAdvancedHighScore", -893762016);
        setIntField(term181851, term181851.getClass(), "totalExpertHighScore", -1248606725);
        setIntField(term181851, term181851.getClass(), "totalMasterHighScore", -607819210);
        setIntField(term181851, term181851.getClass(), "totalReMasterHighScore", 68741854);
        setIntField(term181851, term181851.getClass(), "totalHighSync", 1961222258);
        setIntField(term181851, term181851.getClass(), "totalEasySync", 1545144701);
        setIntField(term181851, term181851.getClass(), "totalBasicSync", 1163892978);
        setIntField(term181851, term181851.getClass(), "totalAdvancedSync", 1729709998);
        setIntField(term181851, term181851.getClass(), "totalExpertSync", 459157676);
        setIntField(term181851, term181851.getClass(), "totalMasterSync", -340610144);
        setIntField(term181851, term181851.getClass(), "totalReMasterSync", 1484067876);
        setIntField(term181851, term181851.getClass(), "playerRating", 662681847);
        setIntField(term181851, term181851.getClass(), "highestRating", 1948570664);
        setIntField(term181851, term181851.getClass(), "rankAuthTailId", -1166018132);
        setField(term181851, term181851.getClass(), "eventWatchedDate", "iNAPriOsZk");
        setField(term181851, term181851.getClass(), "webLimitDate", "WIzLNHlHin");
        setIntField(term181851, term181851.getClass(), "challengeTrackPhase", -1982440893);
        setIntField(term181851, term181851.getClass(), "firstPlayBits", 265382750);
        setField(term181851, term181851.getClass(), "lastPlayDate", "uXqaYisYbX");
        setIntField(term181851, term181851.getClass(), "lastPlaceId", -1957968190);
        setField(term181851, term181851.getClass(), "lastPlaceName", "GoCyvRPeGu");
        setIntField(term181851, term181851.getClass(), "lastRegionId", -1980882760);
        setField(term181851, term181851.getClass(), "lastRegionName", "qokvePyIUm");
        setField(term181851, term181851.getClass(), "lastClientId", "mdkCDAisEP");
        setField(term181851, term181851.getClass(), "lastCountryCode", "KCXlVnMQNa");
        setIntField(term181851, term181851.getClass(), "eventPoint", -1387014014);
        setIntField(term181851, term181851.getClass(), "totalLv", -1595006965);
        setIntField(term181851, term181851.getClass(), "lastLoginBonusDay", -1349951777);
        setIntField(term181851, term181851.getClass(), "lastSurvivalBonusDay", 30827358);
        setIntField(term181851, term181851.getClass(), "loginBonusLv", 399011961);
        setField(term181849, term181849.getClass(), "user", term181851);
        setIntField(term181849, term181849.getClass(), "musicId", 1875667833);
        setIntField(term181849, term181849.getClass(), "level", 1061258672);
        setIntField(term181849, term181849.getClass(), "playCount", 480771762);
        setIntField(term181849, term181849.getClass(), "scoreMax", -40619004);
        setIntField(term181849, term181849.getClass(), "syncRateMax", -1833267827);
        setBooleanField(term181849, term181849.getClass(), "isAllPerfect", true);
        setIntField(term181849, term181849.getClass(), "isAllPerfectPlus", -105664584);
        setIntField(term181849, term181849.getClass(), "fullCombo", -1762551185);
        setIntField(term181849, term181849.getClass(), "maxFever", -1951630485);
        setIntField(term181849, term181849.getClass(), "achievement", 1649161962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSyncRateMax", argTypes, term181849, args);
    }

};


