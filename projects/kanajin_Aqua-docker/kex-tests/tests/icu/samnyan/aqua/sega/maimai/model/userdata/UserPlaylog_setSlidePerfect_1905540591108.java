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

public class UserPlaylog_setSlidePerfect_1905540591108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163863;
     Object term164175;

    public UserPlaylog_setSlidePerfect_1905540591108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term163869 = new Long(1950957495500453461L);
        term163863 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term163865 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term163867 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term163883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163898 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term163863, term163863.getClass(), "id", 4829676996843735281L);
        setLongField(term163865, term163865.getClass(), "id", 1421677180758822434L);
        setLongField(term163867, term163867.getClass(), "id", 2699420536723014626L);
        setField(term163867, term163867.getClass(), "extId", term163869);
        setField(term163867, term163867.getClass(), "luid", "omHQnPTsZR");
        setIntField(term163884, term163884.getClass(), "year", 2028);
        setShortField(term163884, term163884.getClass(), "month", (short) 1);
        setShortField(term163884, term163884.getClass(), "day", (short) 24);
        setField(term163883, term163883.getClass(), "date", term163884);
        setByteField(term163888, term163888.getClass(), "hour", (byte) 3);
        setByteField(term163888, term163888.getClass(), "minute", (byte) 52);
        setByteField(term163888, term163888.getClass(), "second", (byte) 50);
        setIntField(term163888, term163888.getClass(), "nano", 496872064);
        setField(term163883, term163883.getClass(), "time", term163888);
        setField(term163867, term163867.getClass(), "registerTime", term163883);
        setIntField(term163894, term163894.getClass(), "year", 2018);
        setShortField(term163894, term163894.getClass(), "month", (short) 10);
        setShortField(term163894, term163894.getClass(), "day", (short) 15);
        setField(term163893, term163893.getClass(), "date", term163894);
        setByteField(term163898, term163898.getClass(), "hour", (byte) 16);
        setByteField(term163898, term163898.getClass(), "minute", (byte) 49);
        setByteField(term163898, term163898.getClass(), "second", (byte) 22);
        setIntField(term163898, term163898.getClass(), "nano", 61396561);
        setField(term163893, term163893.getClass(), "time", term163898);
        setField(term163867, term163867.getClass(), "accessTime", term163893);
        setField(term163865, term163865.getClass(), "card", term163867);
        setIntField(term163865, term163865.getClass(), "lastDataVersion", -1137450465);
        setField(term163865, term163865.getClass(), "userName", "ffLERohsXA");
        setIntField(term163865, term163865.getClass(), "point", 883184031);
        setIntField(term163865, term163865.getClass(), "totalPoint", 858732697);
        setIntField(term163865, term163865.getClass(), "iconId", -1883914353);
        setIntField(term163865, term163865.getClass(), "nameplateId", 1879420145);
        setIntField(term163865, term163865.getClass(), "frameId", -233477175);
        setIntField(term163865, term163865.getClass(), "trophyId", -99935922);
        setIntField(term163865, term163865.getClass(), "playCount", 552578789);
        setIntField(term163865, term163865.getClass(), "playVsCount", -1306749786);
        setIntField(term163865, term163865.getClass(), "playSyncCount", 328613508);
        setIntField(term163865, term163865.getClass(), "winCount", 829220352);
        setIntField(term163865, term163865.getClass(), "helpCount", 542497856);
        setIntField(term163865, term163865.getClass(), "comboCount", 1888229102);
        setIntField(term163865, term163865.getClass(), "feverCount", -1305718028);
        setIntField(term163865, term163865.getClass(), "totalHiScore", -1681421472);
        setIntField(term163865, term163865.getClass(), "totalEasyHighScore", 2112775128);
        setIntField(term163865, term163865.getClass(), "totalBasicHighScore", 384681987);
        setIntField(term163865, term163865.getClass(), "totalAdvancedHighScore", -1693128954);
        setIntField(term163865, term163865.getClass(), "totalExpertHighScore", 296134080);
        setIntField(term163865, term163865.getClass(), "totalMasterHighScore", 1115713370);
        setIntField(term163865, term163865.getClass(), "totalReMasterHighScore", -2083559391);
        setIntField(term163865, term163865.getClass(), "totalHighSync", 366626773);
        setIntField(term163865, term163865.getClass(), "totalEasySync", 338417057);
        setIntField(term163865, term163865.getClass(), "totalBasicSync", -648138520);
        setIntField(term163865, term163865.getClass(), "totalAdvancedSync", -890741708);
        setIntField(term163865, term163865.getClass(), "totalExpertSync", -42340785);
        setIntField(term163865, term163865.getClass(), "totalMasterSync", 1597262218);
        setIntField(term163865, term163865.getClass(), "totalReMasterSync", -341505436);
        setIntField(term163865, term163865.getClass(), "playerRating", 1566670291);
        setIntField(term163865, term163865.getClass(), "highestRating", -1195556328);
        setIntField(term163865, term163865.getClass(), "rankAuthTailId", -932409062);
        setField(term163865, term163865.getClass(), "eventWatchedDate", "zMTUAmZToL");
        setField(term163865, term163865.getClass(), "webLimitDate", "lnDYutrxeh");
        setIntField(term163865, term163865.getClass(), "challengeTrackPhase", 432170222);
        setIntField(term163865, term163865.getClass(), "firstPlayBits", -2034928019);
        setField(term163865, term163865.getClass(), "lastPlayDate", "cTHQspxtSw");
        setIntField(term163865, term163865.getClass(), "lastPlaceId", 597763758);
        setField(term163865, term163865.getClass(), "lastPlaceName", "RkPKoKjNWD");
        setIntField(term163865, term163865.getClass(), "lastRegionId", -26866336);
        setField(term163865, term163865.getClass(), "lastRegionName", "WWCtVebkwF");
        setField(term163865, term163865.getClass(), "lastClientId", "hEqFqciiYC");
        setField(term163865, term163865.getClass(), "lastCountryCode", "kMXoOfTYML");
        setIntField(term163865, term163865.getClass(), "eventPoint", -1049430);
        setIntField(term163865, term163865.getClass(), "totalLv", -765519423);
        setIntField(term163865, term163865.getClass(), "lastLoginBonusDay", 2059843277);
        setIntField(term163865, term163865.getClass(), "lastSurvivalBonusDay", -2011000214);
        setIntField(term163865, term163865.getClass(), "loginBonusLv", -1002265402);
        setField(term163863, term163863.getClass(), "user", term163865);
        setIntField(term163863, term163863.getClass(), "orderId", -135367789);
        setLongField(term163863, term163863.getClass(), "sortNumber", -8846138397677255464L);
        setIntField(term163863, term163863.getClass(), "placeId", -2069245420);
        setField(term163863, term163863.getClass(), "placeName", "MXZXoFMvzy");
        setField(term163863, term163863.getClass(), "country", "OKprzLoTRc");
        setIntField(term163863, term163863.getClass(), "regionId", 532680219);
        setField(term163863, term163863.getClass(), "playDate", "gnyquIPoBE");
        setField(term163863, term163863.getClass(), "userPlayDate", "Teoezfwsmm");
        setIntField(term163863, term163863.getClass(), "musicId", -1928149061);
        setIntField(term163863, term163863.getClass(), "level", 1601469596);
        setIntField(term163863, term163863.getClass(), "gameMode", 553672935);
        setIntField(term163863, term163863.getClass(), "rivalNum", -1556658111);
        setIntField(term163863, term163863.getClass(), "track", -852088878);
        setIntField(term163863, term163863.getClass(), "eventId", 1791011521);
        setBooleanField(term163863, term163863.getClass(), "isFreeToPlay", false);
        setIntField(term163863, term163863.getClass(), "playerRating", -814779753);
        setLongField(term163863, term163863.getClass(), "playedUserId1", -3563971116155081558L);
        setField(term163863, term163863.getClass(), "playedUserName1", "KmAyeYnpeZ");
        setIntField(term163863, term163863.getClass(), "playedMusicLevel1", 700321767);
        setLongField(term163863, term163863.getClass(), "playedUserId2", -3838500537611270485L);
        setField(term163863, term163863.getClass(), "playedUserName2", "jPXLhQFRXw");
        setIntField(term163863, term163863.getClass(), "playedMusicLevel2", 888579049);
        setLongField(term163863, term163863.getClass(), "playedUserId3", 7524709905774533651L);
        setField(term163863, term163863.getClass(), "playedUserName3", "awecmBkpdf");
        setIntField(term163863, term163863.getClass(), "playedMusicLevel3", 535482504);
        setIntField(term163863, term163863.getClass(), "achievement", -1041131072);
        setIntField(term163863, term163863.getClass(), "score", -1265735194);
        setIntField(term163863, term163863.getClass(), "tapScore", 858391670);
        setIntField(term163863, term163863.getClass(), "holdScore", -94961721);
        setIntField(term163863, term163863.getClass(), "slideScore", 1864116978);
        setIntField(term163863, term163863.getClass(), "breakScore", -1546021694);
        setIntField(term163863, term163863.getClass(), "syncRate", 1972049100);
        setIntField(term163863, term163863.getClass(), "vsWin", -536321123);
        setBooleanField(term163863, term163863.getClass(), "isAllPerfect", true);
        setIntField(term163863, term163863.getClass(), "fullCombo", -81313389);
        setIntField(term163863, term163863.getClass(), "maxFever", -574163534);
        setIntField(term163863, term163863.getClass(), "maxCombo", 1924435101);
        setIntField(term163863, term163863.getClass(), "tapPerfect", 217269670);
        setIntField(term163863, term163863.getClass(), "tapGreat", -25776381);
        setIntField(term163863, term163863.getClass(), "tapGood", 181158656);
        setIntField(term163863, term163863.getClass(), "tapBad", 790793663);
        setIntField(term163863, term163863.getClass(), "holdPerfect", 877507177);
        setIntField(term163863, term163863.getClass(), "holdGreat", 1537226753);
        setIntField(term163863, term163863.getClass(), "holdGood", -1582465133);
        setIntField(term163863, term163863.getClass(), "holdBad", -1717061070);
        setIntField(term163863, term163863.getClass(), "slidePerfect", -740200171);
        setIntField(term163863, term163863.getClass(), "slideGreat", -808598452);
        setIntField(term163863, term163863.getClass(), "slideGood", -1152869430);
        setIntField(term163863, term163863.getClass(), "slideBad", -955308446);
        setIntField(term163863, term163863.getClass(), "breakPerfect", 1717125741);
        setIntField(term163863, term163863.getClass(), "breakGreat", 1696621709);
        setIntField(term163863, term163863.getClass(), "breakGood", -465973366);
        setIntField(term163863, term163863.getClass(), "breakBad", 1081387944);
        setBooleanField(term163863, term163863.getClass(), "isTrackSkip", false);
        setBooleanField(term163863, term163863.getClass(), "isHighScore", false);
        setBooleanField(term163863, term163863.getClass(), "isChallengeTrack", true);
        setIntField(term163863, term163863.getClass(), "challengeLife", -1565615361);
        setIntField(term163863, term163863.getClass(), "challengeRemain", -912043404);
        setIntField(term163863, term163863.getClass(), "isAllPerfectPlus", -844955238);
        term164175 = new Integer(-2005836010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term164175;
        callMethod(klass, "setSlidePerfect", argTypes, term163863, args);
    }

};


