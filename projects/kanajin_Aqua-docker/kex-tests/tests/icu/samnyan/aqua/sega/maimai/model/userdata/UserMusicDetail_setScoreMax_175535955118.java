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
import java.lang.Integer;

public class UserMusicDetail_setScoreMax_175535955118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185157;
     Object term185343;

    public UserMusicDetail_setScoreMax_175535955118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term185163 = new Long(349726685019432833L);
        term185157 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term185159 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term185161 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term185177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185182 = newInstance(Class.forName("java.time.LocalTime"));
        Object term185187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185192 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term185157, term185157.getClass(), "id", 1281090837858883601L);
        setLongField(term185159, term185159.getClass(), "id", -1930943711257094155L);
        setLongField(term185161, term185161.getClass(), "id", 8895118820871384465L);
        setField(term185161, term185161.getClass(), "extId", term185163);
        setField(term185161, term185161.getClass(), "luid", "hWLfpgPZDo");
        setIntField(term185178, term185178.getClass(), "year", 2024);
        setShortField(term185178, term185178.getClass(), "month", (short) 1);
        setShortField(term185178, term185178.getClass(), "day", (short) 13);
        setField(term185177, term185177.getClass(), "date", term185178);
        setByteField(term185182, term185182.getClass(), "hour", (byte) 20);
        setByteField(term185182, term185182.getClass(), "minute", (byte) 37);
        setByteField(term185182, term185182.getClass(), "second", (byte) 58);
        setIntField(term185182, term185182.getClass(), "nano", 961119497);
        setField(term185177, term185177.getClass(), "time", term185182);
        setField(term185161, term185161.getClass(), "registerTime", term185177);
        setIntField(term185188, term185188.getClass(), "year", 2026);
        setShortField(term185188, term185188.getClass(), "month", (short) 12);
        setShortField(term185188, term185188.getClass(), "day", (short) 7);
        setField(term185187, term185187.getClass(), "date", term185188);
        setByteField(term185192, term185192.getClass(), "hour", (byte) 9);
        setByteField(term185192, term185192.getClass(), "minute", (byte) 14);
        setByteField(term185192, term185192.getClass(), "second", (byte) 59);
        setIntField(term185192, term185192.getClass(), "nano", 286434056);
        setField(term185187, term185187.getClass(), "time", term185192);
        setField(term185161, term185161.getClass(), "accessTime", term185187);
        setField(term185159, term185159.getClass(), "card", term185161);
        setIntField(term185159, term185159.getClass(), "lastDataVersion", 1165713141);
        setField(term185159, term185159.getClass(), "userName", "YVKAmDRCvR");
        setIntField(term185159, term185159.getClass(), "point", 1958322335);
        setIntField(term185159, term185159.getClass(), "totalPoint", 1769126826);
        setIntField(term185159, term185159.getClass(), "iconId", -5485074);
        setIntField(term185159, term185159.getClass(), "nameplateId", -1972342988);
        setIntField(term185159, term185159.getClass(), "frameId", -1344263161);
        setIntField(term185159, term185159.getClass(), "trophyId", -1456160297);
        setIntField(term185159, term185159.getClass(), "playCount", -907685278);
        setIntField(term185159, term185159.getClass(), "playVsCount", -261534939);
        setIntField(term185159, term185159.getClass(), "playSyncCount", 372214007);
        setIntField(term185159, term185159.getClass(), "winCount", -1180858795);
        setIntField(term185159, term185159.getClass(), "helpCount", -748983429);
        setIntField(term185159, term185159.getClass(), "comboCount", -52992881);
        setIntField(term185159, term185159.getClass(), "feverCount", -1531419354);
        setIntField(term185159, term185159.getClass(), "totalHiScore", 2023879700);
        setIntField(term185159, term185159.getClass(), "totalEasyHighScore", 633537369);
        setIntField(term185159, term185159.getClass(), "totalBasicHighScore", -276570452);
        setIntField(term185159, term185159.getClass(), "totalAdvancedHighScore", 1091471325);
        setIntField(term185159, term185159.getClass(), "totalExpertHighScore", 861224645);
        setIntField(term185159, term185159.getClass(), "totalMasterHighScore", -1284524137);
        setIntField(term185159, term185159.getClass(), "totalReMasterHighScore", -982291940);
        setIntField(term185159, term185159.getClass(), "totalHighSync", 148549853);
        setIntField(term185159, term185159.getClass(), "totalEasySync", -948592140);
        setIntField(term185159, term185159.getClass(), "totalBasicSync", -1839518509);
        setIntField(term185159, term185159.getClass(), "totalAdvancedSync", 848784413);
        setIntField(term185159, term185159.getClass(), "totalExpertSync", 124846463);
        setIntField(term185159, term185159.getClass(), "totalMasterSync", 1008565596);
        setIntField(term185159, term185159.getClass(), "totalReMasterSync", 343021166);
        setIntField(term185159, term185159.getClass(), "playerRating", -586291975);
        setIntField(term185159, term185159.getClass(), "highestRating", -469609443);
        setIntField(term185159, term185159.getClass(), "rankAuthTailId", -1988533642);
        setField(term185159, term185159.getClass(), "eventWatchedDate", "HseZXIAzZp");
        setField(term185159, term185159.getClass(), "webLimitDate", "jbkKYvnNUK");
        setIntField(term185159, term185159.getClass(), "challengeTrackPhase", 1018885776);
        setIntField(term185159, term185159.getClass(), "firstPlayBits", -1965766209);
        setField(term185159, term185159.getClass(), "lastPlayDate", "qBnhTJalNA");
        setIntField(term185159, term185159.getClass(), "lastPlaceId", 1132537264);
        setField(term185159, term185159.getClass(), "lastPlaceName", "sgpNzhEbZp");
        setIntField(term185159, term185159.getClass(), "lastRegionId", -1940330669);
        setField(term185159, term185159.getClass(), "lastRegionName", "JrardfRgpb");
        setField(term185159, term185159.getClass(), "lastClientId", "LNnXYTWbVh");
        setField(term185159, term185159.getClass(), "lastCountryCode", "IsSVVsKoyt");
        setIntField(term185159, term185159.getClass(), "eventPoint", -992322962);
        setIntField(term185159, term185159.getClass(), "totalLv", -806566603);
        setIntField(term185159, term185159.getClass(), "lastLoginBonusDay", -1615268422);
        setIntField(term185159, term185159.getClass(), "lastSurvivalBonusDay", -1183231317);
        setIntField(term185159, term185159.getClass(), "loginBonusLv", -2065164593);
        setField(term185157, term185157.getClass(), "user", term185159);
        setIntField(term185157, term185157.getClass(), "musicId", 439522316);
        setIntField(term185157, term185157.getClass(), "level", -1281277850);
        setIntField(term185157, term185157.getClass(), "playCount", -1698269899);
        setIntField(term185157, term185157.getClass(), "scoreMax", 1019037899);
        setIntField(term185157, term185157.getClass(), "syncRateMax", 687173717);
        setBooleanField(term185157, term185157.getClass(), "isAllPerfect", false);
        setIntField(term185157, term185157.getClass(), "isAllPerfectPlus", 836990700);
        setIntField(term185157, term185157.getClass(), "fullCombo", -1749072840);
        setIntField(term185157, term185157.getClass(), "maxFever", 572202709);
        setIntField(term185157, term185157.getClass(), "achievement", 868499508);
        term185343 = new Integer(-937584070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term185343;
        callMethod(klass, "setScoreMax", argTypes, term185157, args);
    }

};


