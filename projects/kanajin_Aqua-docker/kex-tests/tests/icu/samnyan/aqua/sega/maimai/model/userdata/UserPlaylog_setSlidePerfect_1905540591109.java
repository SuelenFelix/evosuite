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

public class UserPlaylog_setSlidePerfect_1905540591109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163919;
     Object term164231;

    public UserPlaylog_setSlidePerfect_1905540591109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term163925 = new Long(1950957495500453461L);
        term163919 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term163921 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term163923 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term163939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163944 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163954 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term163919, term163919.getClass(), "id", 4829676996843735281L);
        setLongField(term163921, term163921.getClass(), "id", 1421677180758822434L);
        setLongField(term163923, term163923.getClass(), "id", 2699420536723014626L);
        setField(term163923, term163923.getClass(), "extId", term163925);
        setField(term163923, term163923.getClass(), "luid", "omHQnPTsZR");
        setIntField(term163940, term163940.getClass(), "year", 2028);
        setShortField(term163940, term163940.getClass(), "month", (short) 1);
        setShortField(term163940, term163940.getClass(), "day", (short) 24);
        setField(term163939, term163939.getClass(), "date", term163940);
        setByteField(term163944, term163944.getClass(), "hour", (byte) 3);
        setByteField(term163944, term163944.getClass(), "minute", (byte) 52);
        setByteField(term163944, term163944.getClass(), "second", (byte) 50);
        setIntField(term163944, term163944.getClass(), "nano", 496872064);
        setField(term163939, term163939.getClass(), "time", term163944);
        setField(term163923, term163923.getClass(), "registerTime", term163939);
        setIntField(term163950, term163950.getClass(), "year", 2018);
        setShortField(term163950, term163950.getClass(), "month", (short) 10);
        setShortField(term163950, term163950.getClass(), "day", (short) 15);
        setField(term163949, term163949.getClass(), "date", term163950);
        setByteField(term163954, term163954.getClass(), "hour", (byte) 16);
        setByteField(term163954, term163954.getClass(), "minute", (byte) 49);
        setByteField(term163954, term163954.getClass(), "second", (byte) 22);
        setIntField(term163954, term163954.getClass(), "nano", 61396561);
        setField(term163949, term163949.getClass(), "time", term163954);
        setField(term163923, term163923.getClass(), "accessTime", term163949);
        setField(term163921, term163921.getClass(), "card", term163923);
        setIntField(term163921, term163921.getClass(), "lastDataVersion", -1137450465);
        setField(term163921, term163921.getClass(), "userName", "ffLERohsXA");
        setIntField(term163921, term163921.getClass(), "point", 883184031);
        setIntField(term163921, term163921.getClass(), "totalPoint", 858732697);
        setIntField(term163921, term163921.getClass(), "iconId", -1883914353);
        setIntField(term163921, term163921.getClass(), "nameplateId", 1879420145);
        setIntField(term163921, term163921.getClass(), "frameId", -233477175);
        setIntField(term163921, term163921.getClass(), "trophyId", -99935922);
        setIntField(term163921, term163921.getClass(), "playCount", 552578789);
        setIntField(term163921, term163921.getClass(), "playVsCount", -1306749786);
        setIntField(term163921, term163921.getClass(), "playSyncCount", 328613508);
        setIntField(term163921, term163921.getClass(), "winCount", 829220352);
        setIntField(term163921, term163921.getClass(), "helpCount", 542497856);
        setIntField(term163921, term163921.getClass(), "comboCount", 1888229102);
        setIntField(term163921, term163921.getClass(), "feverCount", -1305718028);
        setIntField(term163921, term163921.getClass(), "totalHiScore", -1681421472);
        setIntField(term163921, term163921.getClass(), "totalEasyHighScore", 2112775128);
        setIntField(term163921, term163921.getClass(), "totalBasicHighScore", 384681987);
        setIntField(term163921, term163921.getClass(), "totalAdvancedHighScore", -1693128954);
        setIntField(term163921, term163921.getClass(), "totalExpertHighScore", 296134080);
        setIntField(term163921, term163921.getClass(), "totalMasterHighScore", 1115713370);
        setIntField(term163921, term163921.getClass(), "totalReMasterHighScore", -2083559391);
        setIntField(term163921, term163921.getClass(), "totalHighSync", 366626773);
        setIntField(term163921, term163921.getClass(), "totalEasySync", 338417057);
        setIntField(term163921, term163921.getClass(), "totalBasicSync", -648138520);
        setIntField(term163921, term163921.getClass(), "totalAdvancedSync", -890741708);
        setIntField(term163921, term163921.getClass(), "totalExpertSync", -42340785);
        setIntField(term163921, term163921.getClass(), "totalMasterSync", 1597262218);
        setIntField(term163921, term163921.getClass(), "totalReMasterSync", -341505436);
        setIntField(term163921, term163921.getClass(), "playerRating", 1566670291);
        setIntField(term163921, term163921.getClass(), "highestRating", -1195556328);
        setIntField(term163921, term163921.getClass(), "rankAuthTailId", -932409062);
        setField(term163921, term163921.getClass(), "eventWatchedDate", "zMTUAmZToL");
        setField(term163921, term163921.getClass(), "webLimitDate", "lnDYutrxeh");
        setIntField(term163921, term163921.getClass(), "challengeTrackPhase", 432170222);
        setIntField(term163921, term163921.getClass(), "firstPlayBits", -2034928019);
        setField(term163921, term163921.getClass(), "lastPlayDate", "cTHQspxtSw");
        setIntField(term163921, term163921.getClass(), "lastPlaceId", 597763758);
        setField(term163921, term163921.getClass(), "lastPlaceName", "RkPKoKjNWD");
        setIntField(term163921, term163921.getClass(), "lastRegionId", -26866336);
        setField(term163921, term163921.getClass(), "lastRegionName", "WWCtVebkwF");
        setField(term163921, term163921.getClass(), "lastClientId", "hEqFqciiYC");
        setField(term163921, term163921.getClass(), "lastCountryCode", "kMXoOfTYML");
        setIntField(term163921, term163921.getClass(), "eventPoint", -1049430);
        setIntField(term163921, term163921.getClass(), "totalLv", -765519423);
        setIntField(term163921, term163921.getClass(), "lastLoginBonusDay", 2059843277);
        setIntField(term163921, term163921.getClass(), "lastSurvivalBonusDay", -2011000214);
        setIntField(term163921, term163921.getClass(), "loginBonusLv", -1002265402);
        setField(term163919, term163919.getClass(), "user", term163921);
        setIntField(term163919, term163919.getClass(), "orderId", -135367789);
        setLongField(term163919, term163919.getClass(), "sortNumber", -8846138397677255464L);
        setIntField(term163919, term163919.getClass(), "placeId", -2069245420);
        setField(term163919, term163919.getClass(), "placeName", "MXZXoFMvzy");
        setField(term163919, term163919.getClass(), "country", "OKprzLoTRc");
        setIntField(term163919, term163919.getClass(), "regionId", 532680219);
        setField(term163919, term163919.getClass(), "playDate", "gnyquIPoBE");
        setField(term163919, term163919.getClass(), "userPlayDate", "Teoezfwsmm");
        setIntField(term163919, term163919.getClass(), "musicId", -1928149061);
        setIntField(term163919, term163919.getClass(), "level", 1601469596);
        setIntField(term163919, term163919.getClass(), "gameMode", 553672935);
        setIntField(term163919, term163919.getClass(), "rivalNum", -1556658111);
        setIntField(term163919, term163919.getClass(), "track", -852088878);
        setIntField(term163919, term163919.getClass(), "eventId", 1791011521);
        setBooleanField(term163919, term163919.getClass(), "isFreeToPlay", false);
        setIntField(term163919, term163919.getClass(), "playerRating", -814779753);
        setLongField(term163919, term163919.getClass(), "playedUserId1", -3563971116155081558L);
        setField(term163919, term163919.getClass(), "playedUserName1", "KmAyeYnpeZ");
        setIntField(term163919, term163919.getClass(), "playedMusicLevel1", 700321767);
        setLongField(term163919, term163919.getClass(), "playedUserId2", -3838500537611270485L);
        setField(term163919, term163919.getClass(), "playedUserName2", "jPXLhQFRXw");
        setIntField(term163919, term163919.getClass(), "playedMusicLevel2", 888579049);
        setLongField(term163919, term163919.getClass(), "playedUserId3", 7524709905774533651L);
        setField(term163919, term163919.getClass(), "playedUserName3", "awecmBkpdf");
        setIntField(term163919, term163919.getClass(), "playedMusicLevel3", 535482504);
        setIntField(term163919, term163919.getClass(), "achievement", -1041131072);
        setIntField(term163919, term163919.getClass(), "score", -1265735194);
        setIntField(term163919, term163919.getClass(), "tapScore", 858391670);
        setIntField(term163919, term163919.getClass(), "holdScore", -94961721);
        setIntField(term163919, term163919.getClass(), "slideScore", 1864116978);
        setIntField(term163919, term163919.getClass(), "breakScore", -1546021694);
        setIntField(term163919, term163919.getClass(), "syncRate", 1972049100);
        setIntField(term163919, term163919.getClass(), "vsWin", -536321123);
        setBooleanField(term163919, term163919.getClass(), "isAllPerfect", true);
        setIntField(term163919, term163919.getClass(), "fullCombo", -81313389);
        setIntField(term163919, term163919.getClass(), "maxFever", -574163534);
        setIntField(term163919, term163919.getClass(), "maxCombo", 1924435101);
        setIntField(term163919, term163919.getClass(), "tapPerfect", 217269670);
        setIntField(term163919, term163919.getClass(), "tapGreat", -25776381);
        setIntField(term163919, term163919.getClass(), "tapGood", 181158656);
        setIntField(term163919, term163919.getClass(), "tapBad", 790793663);
        setIntField(term163919, term163919.getClass(), "holdPerfect", 877507177);
        setIntField(term163919, term163919.getClass(), "holdGreat", 1537226753);
        setIntField(term163919, term163919.getClass(), "holdGood", -1582465133);
        setIntField(term163919, term163919.getClass(), "holdBad", -1717061070);
        setIntField(term163919, term163919.getClass(), "slidePerfect", -740200171);
        setIntField(term163919, term163919.getClass(), "slideGreat", -808598452);
        setIntField(term163919, term163919.getClass(), "slideGood", -1152869430);
        setIntField(term163919, term163919.getClass(), "slideBad", -955308446);
        setIntField(term163919, term163919.getClass(), "breakPerfect", 1717125741);
        setIntField(term163919, term163919.getClass(), "breakGreat", 1696621709);
        setIntField(term163919, term163919.getClass(), "breakGood", -465973366);
        setIntField(term163919, term163919.getClass(), "breakBad", 1081387944);
        setBooleanField(term163919, term163919.getClass(), "isTrackSkip", false);
        setBooleanField(term163919, term163919.getClass(), "isHighScore", false);
        setBooleanField(term163919, term163919.getClass(), "isChallengeTrack", true);
        setIntField(term163919, term163919.getClass(), "challengeLife", -1565615361);
        setIntField(term163919, term163919.getClass(), "challengeRemain", -912043404);
        setIntField(term163919, term163919.getClass(), "isAllPerfectPlus", -844955238);
        term164231 = new Integer(-2005836010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term164231;
        callMethod(klass, "setSlidePerfect", argTypes, term163919, args);
    }

};


