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

public class UserOption_getId_10212548311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51037;

    public UserOption_getId_10212548311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51043 = new Long(-3730936709704460408L);
        term51037 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term51039 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term51041 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term51057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51062 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51067 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51068 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51072 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term51037, term51037.getClass(), "id", 3453457027014743006L);
        setLongField(term51039, term51039.getClass(), "id", 3931473624300151730L);
        setLongField(term51041, term51041.getClass(), "id", 661905373566913125L);
        setField(term51041, term51041.getClass(), "extId", term51043);
        setField(term51041, term51041.getClass(), "luid", "SeWCUkXfZv");
        setIntField(term51058, term51058.getClass(), "year", 2028);
        setShortField(term51058, term51058.getClass(), "month", (short) 7);
        setShortField(term51058, term51058.getClass(), "day", (short) 4);
        setField(term51057, term51057.getClass(), "date", term51058);
        setByteField(term51062, term51062.getClass(), "hour", (byte) 13);
        setByteField(term51062, term51062.getClass(), "minute", (byte) 43);
        setByteField(term51062, term51062.getClass(), "second", (byte) 17);
        setIntField(term51062, term51062.getClass(), "nano", 949713407);
        setField(term51057, term51057.getClass(), "time", term51062);
        setField(term51041, term51041.getClass(), "registerTime", term51057);
        setIntField(term51068, term51068.getClass(), "year", 2013);
        setShortField(term51068, term51068.getClass(), "month", (short) 3);
        setShortField(term51068, term51068.getClass(), "day", (short) 25);
        setField(term51067, term51067.getClass(), "date", term51068);
        setByteField(term51072, term51072.getClass(), "hour", (byte) 16);
        setByteField(term51072, term51072.getClass(), "minute", (byte) 28);
        setByteField(term51072, term51072.getClass(), "second", (byte) 0);
        setIntField(term51072, term51072.getClass(), "nano", 265797826);
        setField(term51067, term51067.getClass(), "time", term51072);
        setField(term51041, term51041.getClass(), "accessTime", term51067);
        setField(term51039, term51039.getClass(), "card", term51041);
        setIntField(term51039, term51039.getClass(), "lastDataVersion", 392977323);
        setField(term51039, term51039.getClass(), "userName", "woQcQRYwNH");
        setIntField(term51039, term51039.getClass(), "point", -794722040);
        setIntField(term51039, term51039.getClass(), "totalPoint", 464722569);
        setIntField(term51039, term51039.getClass(), "iconId", -12715882);
        setIntField(term51039, term51039.getClass(), "nameplateId", -1629082667);
        setIntField(term51039, term51039.getClass(), "frameId", 1938805252);
        setIntField(term51039, term51039.getClass(), "trophyId", 892926651);
        setIntField(term51039, term51039.getClass(), "playCount", 324394779);
        setIntField(term51039, term51039.getClass(), "playVsCount", 1334207398);
        setIntField(term51039, term51039.getClass(), "playSyncCount", 1899917071);
        setIntField(term51039, term51039.getClass(), "winCount", 2010556609);
        setIntField(term51039, term51039.getClass(), "helpCount", -328864713);
        setIntField(term51039, term51039.getClass(), "comboCount", -624310741);
        setIntField(term51039, term51039.getClass(), "feverCount", -336930851);
        setIntField(term51039, term51039.getClass(), "totalHiScore", 1850349935);
        setIntField(term51039, term51039.getClass(), "totalEasyHighScore", -1353579264);
        setIntField(term51039, term51039.getClass(), "totalBasicHighScore", -1995862281);
        setIntField(term51039, term51039.getClass(), "totalAdvancedHighScore", -64331464);
        setIntField(term51039, term51039.getClass(), "totalExpertHighScore", 1814821269);
        setIntField(term51039, term51039.getClass(), "totalMasterHighScore", -2035330261);
        setIntField(term51039, term51039.getClass(), "totalReMasterHighScore", -839111848);
        setIntField(term51039, term51039.getClass(), "totalHighSync", 1712179237);
        setIntField(term51039, term51039.getClass(), "totalEasySync", -2122863540);
        setIntField(term51039, term51039.getClass(), "totalBasicSync", -811923755);
        setIntField(term51039, term51039.getClass(), "totalAdvancedSync", -353643828);
        setIntField(term51039, term51039.getClass(), "totalExpertSync", -632794298);
        setIntField(term51039, term51039.getClass(), "totalMasterSync", -530294126);
        setIntField(term51039, term51039.getClass(), "totalReMasterSync", 798290048);
        setIntField(term51039, term51039.getClass(), "playerRating", 383365811);
        setIntField(term51039, term51039.getClass(), "highestRating", 140322430);
        setIntField(term51039, term51039.getClass(), "rankAuthTailId", -1492719591);
        setField(term51039, term51039.getClass(), "eventWatchedDate", "uQjzusifTg");
        setField(term51039, term51039.getClass(), "webLimitDate", "mOulGkUjOk");
        setIntField(term51039, term51039.getClass(), "challengeTrackPhase", 2077964123);
        setIntField(term51039, term51039.getClass(), "firstPlayBits", 1694212421);
        setField(term51039, term51039.getClass(), "lastPlayDate", "hNWRuNEgOf");
        setIntField(term51039, term51039.getClass(), "lastPlaceId", 1104915674);
        setField(term51039, term51039.getClass(), "lastPlaceName", "CEtjGBplmv");
        setIntField(term51039, term51039.getClass(), "lastRegionId", -44179109);
        setField(term51039, term51039.getClass(), "lastRegionName", "XosDTAzIAT");
        setField(term51039, term51039.getClass(), "lastClientId", "lcCEhCpiZM");
        setField(term51039, term51039.getClass(), "lastCountryCode", "OPJlqMJxdq");
        setIntField(term51039, term51039.getClass(), "eventPoint", 248819653);
        setIntField(term51039, term51039.getClass(), "totalLv", -429028411);
        setIntField(term51039, term51039.getClass(), "lastLoginBonusDay", -337757010);
        setIntField(term51039, term51039.getClass(), "lastSurvivalBonusDay", -1192904975);
        setIntField(term51039, term51039.getClass(), "loginBonusLv", 619419155);
        setField(term51037, term51037.getClass(), "user", term51039);
        setIntField(term51037, term51037.getClass(), "soudEffect", -607185930);
        setIntField(term51037, term51037.getClass(), "mirrorMode", -108242433);
        setIntField(term51037, term51037.getClass(), "guideSpeed", 2045041189);
        setIntField(term51037, term51037.getClass(), "bgInfo", 1746055569);
        setIntField(term51037, term51037.getClass(), "brightness", 2048463054);
        setIntField(term51037, term51037.getClass(), "isStarRot", 1251228448);
        setIntField(term51037, term51037.getClass(), "breakSe", -1853583675);
        setIntField(term51037, term51037.getClass(), "slideSe", 2085299143);
        setIntField(term51037, term51037.getClass(), "hardJudge", 41805417);
        setIntField(term51037, term51037.getClass(), "isTagJump", 296055711);
        setIntField(term51037, term51037.getClass(), "breakSeVol", 465864250);
        setIntField(term51037, term51037.getClass(), "slideSeVol", 941713404);
        setIntField(term51037, term51037.getClass(), "isUpperDisp", 585296192);
        setIntField(term51037, term51037.getClass(), "trackSkip", -2093946527);
        setIntField(term51037, term51037.getClass(), "optionMode", 312776664);
        setIntField(term51037, term51037.getClass(), "simpleOptionParam", 243025663);
        setIntField(term51037, term51037.getClass(), "adjustTiming", -1565507430);
        setIntField(term51037, term51037.getClass(), "dispTiming", -1974437877);
        setIntField(term51037, term51037.getClass(), "timingPos", -910087562);
        setIntField(term51037, term51037.getClass(), "ansVol", -478100700);
        setIntField(term51037, term51037.getClass(), "noteVol", -644350910);
        setIntField(term51037, term51037.getClass(), "dmgVol", 1392174755);
        setIntField(term51037, term51037.getClass(), "appealFlame", 542384961);
        setIntField(term51037, term51037.getClass(), "isFeverDisp", 821706893);
        setIntField(term51037, term51037.getClass(), "dispJudge", -624144007);
        setIntField(term51037, term51037.getClass(), "judgePos", 869208951);
        setIntField(term51037, term51037.getClass(), "ratingGuard", -1001034291);
        setIntField(term51037, term51037.getClass(), "selectChara", -1612288598);
        setIntField(term51037, term51037.getClass(), "sortType", 1512583982);
        setIntField(term51037, term51037.getClass(), "filterGenre", 554400317);
        setIntField(term51037, term51037.getClass(), "filterLevel", 1771270508);
        setIntField(term51037, term51037.getClass(), "filterRank", 2025369602);
        setIntField(term51037, term51037.getClass(), "filterVersion", 1229764972);
        setIntField(term51037, term51037.getClass(), "filterRec", -202016645);
        setIntField(term51037, term51037.getClass(), "filterFullCombo", -1135802429);
        setIntField(term51037, term51037.getClass(), "filterAllPerfect", -354346702);
        setIntField(term51037, term51037.getClass(), "filterDifficulty", -471266285);
        setIntField(term51037, term51037.getClass(), "filterFullSync", -1203375064);
        setIntField(term51037, term51037.getClass(), "filterReMaster", -849622887);
        setIntField(term51037, term51037.getClass(), "filterMaxFever", -631297994);
        setIntField(term51037, term51037.getClass(), "finalSelectId", 864666826);
        setIntField(term51037, term51037.getClass(), "finalSelectCategory", 40323219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term51037, args);
    }

};


