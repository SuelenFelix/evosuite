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

public class UserPlaylog_getChallengeRemain_75013787659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140239;

    public UserPlaylog_getChallengeRemain_75013787659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140245 = new Long(-1528017371096319990L);
        term140239 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term140241 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term140243 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term140259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140264 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140269 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140270 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140274 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term140239, term140239.getClass(), "id", 7338947505433756976L);
        setLongField(term140241, term140241.getClass(), "id", -6284173466459484010L);
        setLongField(term140243, term140243.getClass(), "id", -5513509665682251667L);
        setField(term140243, term140243.getClass(), "extId", term140245);
        setField(term140243, term140243.getClass(), "luid", "snpbZcNTTs");
        setIntField(term140260, term140260.getClass(), "year", 2020);
        setShortField(term140260, term140260.getClass(), "month", (short) 12);
        setShortField(term140260, term140260.getClass(), "day", (short) 3);
        setField(term140259, term140259.getClass(), "date", term140260);
        setByteField(term140264, term140264.getClass(), "hour", (byte) 21);
        setByteField(term140264, term140264.getClass(), "minute", (byte) 9);
        setByteField(term140264, term140264.getClass(), "second", (byte) 18);
        setIntField(term140264, term140264.getClass(), "nano", 913732377);
        setField(term140259, term140259.getClass(), "time", term140264);
        setField(term140243, term140243.getClass(), "registerTime", term140259);
        setIntField(term140270, term140270.getClass(), "year", 2018);
        setShortField(term140270, term140270.getClass(), "month", (short) 12);
        setShortField(term140270, term140270.getClass(), "day", (short) 2);
        setField(term140269, term140269.getClass(), "date", term140270);
        setByteField(term140274, term140274.getClass(), "hour", (byte) 15);
        setByteField(term140274, term140274.getClass(), "minute", (byte) 7);
        setByteField(term140274, term140274.getClass(), "second", (byte) 32);
        setIntField(term140274, term140274.getClass(), "nano", 109301383);
        setField(term140269, term140269.getClass(), "time", term140274);
        setField(term140243, term140243.getClass(), "accessTime", term140269);
        setField(term140241, term140241.getClass(), "card", term140243);
        setIntField(term140241, term140241.getClass(), "lastDataVersion", 1635163759);
        setField(term140241, term140241.getClass(), "userName", "SXATqDKVMx");
        setIntField(term140241, term140241.getClass(), "point", -1183115171);
        setIntField(term140241, term140241.getClass(), "totalPoint", -1473536555);
        setIntField(term140241, term140241.getClass(), "iconId", -741876612);
        setIntField(term140241, term140241.getClass(), "nameplateId", 472842962);
        setIntField(term140241, term140241.getClass(), "frameId", -1859274829);
        setIntField(term140241, term140241.getClass(), "trophyId", 1457126791);
        setIntField(term140241, term140241.getClass(), "playCount", 856920140);
        setIntField(term140241, term140241.getClass(), "playVsCount", -383713307);
        setIntField(term140241, term140241.getClass(), "playSyncCount", -1558025995);
        setIntField(term140241, term140241.getClass(), "winCount", 1056318989);
        setIntField(term140241, term140241.getClass(), "helpCount", 334255307);
        setIntField(term140241, term140241.getClass(), "comboCount", 1723184992);
        setIntField(term140241, term140241.getClass(), "feverCount", 221967550);
        setIntField(term140241, term140241.getClass(), "totalHiScore", 2081272358);
        setIntField(term140241, term140241.getClass(), "totalEasyHighScore", 307424802);
        setIntField(term140241, term140241.getClass(), "totalBasicHighScore", 2082908668);
        setIntField(term140241, term140241.getClass(), "totalAdvancedHighScore", 1900872551);
        setIntField(term140241, term140241.getClass(), "totalExpertHighScore", -1892474530);
        setIntField(term140241, term140241.getClass(), "totalMasterHighScore", 964981570);
        setIntField(term140241, term140241.getClass(), "totalReMasterHighScore", 2100756755);
        setIntField(term140241, term140241.getClass(), "totalHighSync", -1101017120);
        setIntField(term140241, term140241.getClass(), "totalEasySync", 811430983);
        setIntField(term140241, term140241.getClass(), "totalBasicSync", 382004944);
        setIntField(term140241, term140241.getClass(), "totalAdvancedSync", 805654152);
        setIntField(term140241, term140241.getClass(), "totalExpertSync", -1148079165);
        setIntField(term140241, term140241.getClass(), "totalMasterSync", 678349065);
        setIntField(term140241, term140241.getClass(), "totalReMasterSync", 1082039133);
        setIntField(term140241, term140241.getClass(), "playerRating", -44112156);
        setIntField(term140241, term140241.getClass(), "highestRating", -809377626);
        setIntField(term140241, term140241.getClass(), "rankAuthTailId", -2106999779);
        setField(term140241, term140241.getClass(), "eventWatchedDate", "WmLDnzSUcH");
        setField(term140241, term140241.getClass(), "webLimitDate", "jzYgniVftZ");
        setIntField(term140241, term140241.getClass(), "challengeTrackPhase", 1805397722);
        setIntField(term140241, term140241.getClass(), "firstPlayBits", 1324104129);
        setField(term140241, term140241.getClass(), "lastPlayDate", "hCbXOXOOYP");
        setIntField(term140241, term140241.getClass(), "lastPlaceId", 638311088);
        setField(term140241, term140241.getClass(), "lastPlaceName", "QDpqtNZTXP");
        setIntField(term140241, term140241.getClass(), "lastRegionId", 1553305941);
        setField(term140241, term140241.getClass(), "lastRegionName", "ERsxGrzfGd");
        setField(term140241, term140241.getClass(), "lastClientId", "CRKkCjukkS");
        setField(term140241, term140241.getClass(), "lastCountryCode", "PqRZMgCthN");
        setIntField(term140241, term140241.getClass(), "eventPoint", 1014491466);
        setIntField(term140241, term140241.getClass(), "totalLv", -232797078);
        setIntField(term140241, term140241.getClass(), "lastLoginBonusDay", -907573138);
        setIntField(term140241, term140241.getClass(), "lastSurvivalBonusDay", 533555487);
        setIntField(term140241, term140241.getClass(), "loginBonusLv", 270555833);
        setField(term140239, term140239.getClass(), "user", term140241);
        setIntField(term140239, term140239.getClass(), "orderId", -1454916925);
        setLongField(term140239, term140239.getClass(), "sortNumber", 4680638415078495388L);
        setIntField(term140239, term140239.getClass(), "placeId", -1348867097);
        setField(term140239, term140239.getClass(), "placeName", "GrJVQEmmlP");
        setField(term140239, term140239.getClass(), "country", "znnUCOtZMp");
        setIntField(term140239, term140239.getClass(), "regionId", 1412892169);
        setField(term140239, term140239.getClass(), "playDate", "QhqWOzlnRY");
        setField(term140239, term140239.getClass(), "userPlayDate", "PgDJdYVklE");
        setIntField(term140239, term140239.getClass(), "musicId", 1364137068);
        setIntField(term140239, term140239.getClass(), "level", 1874584166);
        setIntField(term140239, term140239.getClass(), "gameMode", 869259501);
        setIntField(term140239, term140239.getClass(), "rivalNum", -480123256);
        setIntField(term140239, term140239.getClass(), "track", 1232910681);
        setIntField(term140239, term140239.getClass(), "eventId", 1226906639);
        setBooleanField(term140239, term140239.getClass(), "isFreeToPlay", true);
        setIntField(term140239, term140239.getClass(), "playerRating", 1627208885);
        setLongField(term140239, term140239.getClass(), "playedUserId1", 7744119580121297988L);
        setField(term140239, term140239.getClass(), "playedUserName1", "mdNIWipYwz");
        setIntField(term140239, term140239.getClass(), "playedMusicLevel1", -1869105420);
        setLongField(term140239, term140239.getClass(), "playedUserId2", 5705211845607271062L);
        setField(term140239, term140239.getClass(), "playedUserName2", "LPiRxaDRZj");
        setIntField(term140239, term140239.getClass(), "playedMusicLevel2", 893460953);
        setLongField(term140239, term140239.getClass(), "playedUserId3", 4947168794582157385L);
        setField(term140239, term140239.getClass(), "playedUserName3", "ghNeQsQdJv");
        setIntField(term140239, term140239.getClass(), "playedMusicLevel3", 1348216633);
        setIntField(term140239, term140239.getClass(), "achievement", -5190998);
        setIntField(term140239, term140239.getClass(), "score", 1160994774);
        setIntField(term140239, term140239.getClass(), "tapScore", 451249819);
        setIntField(term140239, term140239.getClass(), "holdScore", -1756025848);
        setIntField(term140239, term140239.getClass(), "slideScore", -105569667);
        setIntField(term140239, term140239.getClass(), "breakScore", -2140916634);
        setIntField(term140239, term140239.getClass(), "syncRate", 368699100);
        setIntField(term140239, term140239.getClass(), "vsWin", -547948695);
        setBooleanField(term140239, term140239.getClass(), "isAllPerfect", false);
        setIntField(term140239, term140239.getClass(), "fullCombo", 332776320);
        setIntField(term140239, term140239.getClass(), "maxFever", -1944648370);
        setIntField(term140239, term140239.getClass(), "maxCombo", -1977737772);
        setIntField(term140239, term140239.getClass(), "tapPerfect", 1088640375);
        setIntField(term140239, term140239.getClass(), "tapGreat", 951017780);
        setIntField(term140239, term140239.getClass(), "tapGood", -736683084);
        setIntField(term140239, term140239.getClass(), "tapBad", -1119724685);
        setIntField(term140239, term140239.getClass(), "holdPerfect", 596127264);
        setIntField(term140239, term140239.getClass(), "holdGreat", 358116640);
        setIntField(term140239, term140239.getClass(), "holdGood", -317366153);
        setIntField(term140239, term140239.getClass(), "holdBad", 1839854669);
        setIntField(term140239, term140239.getClass(), "slidePerfect", -254326776);
        setIntField(term140239, term140239.getClass(), "slideGreat", 1210575332);
        setIntField(term140239, term140239.getClass(), "slideGood", 258225079);
        setIntField(term140239, term140239.getClass(), "slideBad", -46744367);
        setIntField(term140239, term140239.getClass(), "breakPerfect", 1667028397);
        setIntField(term140239, term140239.getClass(), "breakGreat", -676471924);
        setIntField(term140239, term140239.getClass(), "breakGood", 1494923419);
        setIntField(term140239, term140239.getClass(), "breakBad", 556950465);
        setBooleanField(term140239, term140239.getClass(), "isTrackSkip", true);
        setBooleanField(term140239, term140239.getClass(), "isHighScore", false);
        setBooleanField(term140239, term140239.getClass(), "isChallengeTrack", false);
        setIntField(term140239, term140239.getClass(), "challengeLife", 1099903179);
        setIntField(term140239, term140239.getClass(), "challengeRemain", -1521358551);
        setIntField(term140239, term140239.getClass(), "isAllPerfectPlus", 1832556877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeRemain", argTypes, term140239, args);
    }

};


