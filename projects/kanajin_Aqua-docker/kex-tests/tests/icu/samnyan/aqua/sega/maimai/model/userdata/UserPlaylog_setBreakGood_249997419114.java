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

public class UserPlaylog_setBreakGood_249997419114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3993073;
     Object term3993385;

    public UserPlaylog_setBreakGood_249997419114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3993079 = new Long(-7105219826727107473L);
        term3993073 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3993075 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3993077 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3993093 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3993094 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3993098 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3993103 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3993104 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3993108 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3993073, term3993073.getClass(), "id", -8576522510272246008L);
        setLongField(term3993075, term3993075.getClass(), "id", -7489372581629439633L);
        setLongField(term3993077, term3993077.getClass(), "id", -9153535918519292800L);
        setField(term3993077, term3993077.getClass(), "extId", term3993079);
        setField(term3993077, term3993077.getClass(), "luid", "wDYjwwVpdi");
        setIntField(term3993094, term3993094.getClass(), "year", 2011);
        setShortField(term3993094, term3993094.getClass(), "month", (short) 7);
        setShortField(term3993094, term3993094.getClass(), "day", (short) 25);
        setField(term3993093, term3993093.getClass(), "date", term3993094);
        setByteField(term3993098, term3993098.getClass(), "hour", (byte) 0);
        setByteField(term3993098, term3993098.getClass(), "minute", (byte) 4);
        setByteField(term3993098, term3993098.getClass(), "second", (byte) 20);
        setIntField(term3993098, term3993098.getClass(), "nano", 716049935);
        setField(term3993093, term3993093.getClass(), "time", term3993098);
        setField(term3993077, term3993077.getClass(), "registerTime", term3993093);
        setIntField(term3993104, term3993104.getClass(), "year", 2025);
        setShortField(term3993104, term3993104.getClass(), "month", (short) 7);
        setShortField(term3993104, term3993104.getClass(), "day", (short) 13);
        setField(term3993103, term3993103.getClass(), "date", term3993104);
        setByteField(term3993108, term3993108.getClass(), "hour", (byte) 21);
        setByteField(term3993108, term3993108.getClass(), "minute", (byte) 14);
        setByteField(term3993108, term3993108.getClass(), "second", (byte) 58);
        setIntField(term3993108, term3993108.getClass(), "nano", 189384548);
        setField(term3993103, term3993103.getClass(), "time", term3993108);
        setField(term3993077, term3993077.getClass(), "accessTime", term3993103);
        setField(term3993075, term3993075.getClass(), "card", term3993077);
        setIntField(term3993075, term3993075.getClass(), "lastDataVersion", 43345507);
        setField(term3993075, term3993075.getClass(), "userName", "RcVpwDgIhh");
        setIntField(term3993075, term3993075.getClass(), "point", 1013777152);
        setIntField(term3993075, term3993075.getClass(), "totalPoint", 1163819865);
        setIntField(term3993075, term3993075.getClass(), "iconId", -84421637);
        setIntField(term3993075, term3993075.getClass(), "nameplateId", 1796508925);
        setIntField(term3993075, term3993075.getClass(), "frameId", -1394223450);
        setIntField(term3993075, term3993075.getClass(), "trophyId", 1978024992);
        setIntField(term3993075, term3993075.getClass(), "playCount", 229683200);
        setIntField(term3993075, term3993075.getClass(), "playVsCount", 1024829125);
        setIntField(term3993075, term3993075.getClass(), "playSyncCount", 1898442283);
        setIntField(term3993075, term3993075.getClass(), "winCount", -804159982);
        setIntField(term3993075, term3993075.getClass(), "helpCount", -1678463891);
        setIntField(term3993075, term3993075.getClass(), "comboCount", 711427857);
        setIntField(term3993075, term3993075.getClass(), "feverCount", -1986281869);
        setIntField(term3993075, term3993075.getClass(), "totalHiScore", -1183984769);
        setIntField(term3993075, term3993075.getClass(), "totalEasyHighScore", -1676791155);
        setIntField(term3993075, term3993075.getClass(), "totalBasicHighScore", -640699078);
        setIntField(term3993075, term3993075.getClass(), "totalAdvancedHighScore", -1268717894);
        setIntField(term3993075, term3993075.getClass(), "totalExpertHighScore", 1136174615);
        setIntField(term3993075, term3993075.getClass(), "totalMasterHighScore", 413618875);
        setIntField(term3993075, term3993075.getClass(), "totalReMasterHighScore", 730310437);
        setIntField(term3993075, term3993075.getClass(), "totalHighSync", 1907431824);
        setIntField(term3993075, term3993075.getClass(), "totalEasySync", 805690783);
        setIntField(term3993075, term3993075.getClass(), "totalBasicSync", 200638210);
        setIntField(term3993075, term3993075.getClass(), "totalAdvancedSync", 465211682);
        setIntField(term3993075, term3993075.getClass(), "totalExpertSync", -342224347);
        setIntField(term3993075, term3993075.getClass(), "totalMasterSync", -1107792414);
        setIntField(term3993075, term3993075.getClass(), "totalReMasterSync", 2014563331);
        setIntField(term3993075, term3993075.getClass(), "playerRating", -1049633036);
        setIntField(term3993075, term3993075.getClass(), "highestRating", 520821190);
        setIntField(term3993075, term3993075.getClass(), "rankAuthTailId", -634861595);
        setField(term3993075, term3993075.getClass(), "eventWatchedDate", "dIuGToiFeu");
        setField(term3993075, term3993075.getClass(), "webLimitDate", "iEIMCFkjjm");
        setIntField(term3993075, term3993075.getClass(), "challengeTrackPhase", -1505371109);
        setIntField(term3993075, term3993075.getClass(), "firstPlayBits", 1518053936);
        setField(term3993075, term3993075.getClass(), "lastPlayDate", "dVsfoOKgkA");
        setIntField(term3993075, term3993075.getClass(), "lastPlaceId", -386473561);
        setField(term3993075, term3993075.getClass(), "lastPlaceName", "KmGbRdurSk");
        setIntField(term3993075, term3993075.getClass(), "lastRegionId", -672880035);
        setField(term3993075, term3993075.getClass(), "lastRegionName", "NLsQdUqWvQ");
        setField(term3993075, term3993075.getClass(), "lastClientId", "CXUxyTQYev");
        setField(term3993075, term3993075.getClass(), "lastCountryCode", "ECylShPVCW");
        setIntField(term3993075, term3993075.getClass(), "eventPoint", 1440471236);
        setIntField(term3993075, term3993075.getClass(), "totalLv", -1261452854);
        setIntField(term3993075, term3993075.getClass(), "lastLoginBonusDay", -15551262);
        setIntField(term3993075, term3993075.getClass(), "lastSurvivalBonusDay", -1254685339);
        setIntField(term3993075, term3993075.getClass(), "loginBonusLv", -871227845);
        setField(term3993073, term3993073.getClass(), "user", term3993075);
        setIntField(term3993073, term3993073.getClass(), "orderId", 1478301420);
        setLongField(term3993073, term3993073.getClass(), "sortNumber", 4653741412842117462L);
        setIntField(term3993073, term3993073.getClass(), "placeId", -590854465);
        setField(term3993073, term3993073.getClass(), "placeName", "vyvICjJeAI");
        setField(term3993073, term3993073.getClass(), "country", "fZhAqLXIJM");
        setIntField(term3993073, term3993073.getClass(), "regionId", 1541268843);
        setField(term3993073, term3993073.getClass(), "playDate", "jIjTjibPcM");
        setField(term3993073, term3993073.getClass(), "userPlayDate", "aFweFlrldA");
        setIntField(term3993073, term3993073.getClass(), "musicId", -1630700189);
        setIntField(term3993073, term3993073.getClass(), "level", 1902027529);
        setIntField(term3993073, term3993073.getClass(), "gameMode", 1249878326);
        setIntField(term3993073, term3993073.getClass(), "rivalNum", 29333867);
        setIntField(term3993073, term3993073.getClass(), "track", 1455372265);
        setIntField(term3993073, term3993073.getClass(), "eventId", -639362254);
        setBooleanField(term3993073, term3993073.getClass(), "isFreeToPlay", false);
        setIntField(term3993073, term3993073.getClass(), "playerRating", 599455665);
        setLongField(term3993073, term3993073.getClass(), "playedUserId1", 4773382448304393685L);
        setField(term3993073, term3993073.getClass(), "playedUserName1", "MNjrgueXSl");
        setIntField(term3993073, term3993073.getClass(), "playedMusicLevel1", -959477664);
        setLongField(term3993073, term3993073.getClass(), "playedUserId2", 5152336264280290217L);
        setField(term3993073, term3993073.getClass(), "playedUserName2", "oSdJyjvkrr");
        setIntField(term3993073, term3993073.getClass(), "playedMusicLevel2", -1601561944);
        setLongField(term3993073, term3993073.getClass(), "playedUserId3", 478048646788057136L);
        setField(term3993073, term3993073.getClass(), "playedUserName3", "TugGjetikj");
        setIntField(term3993073, term3993073.getClass(), "playedMusicLevel3", 1711539368);
        setIntField(term3993073, term3993073.getClass(), "achievement", 668361237);
        setIntField(term3993073, term3993073.getClass(), "score", -1201247754);
        setIntField(term3993073, term3993073.getClass(), "tapScore", 1513380429);
        setIntField(term3993073, term3993073.getClass(), "holdScore", -1979580751);
        setIntField(term3993073, term3993073.getClass(), "slideScore", -36060157);
        setIntField(term3993073, term3993073.getClass(), "breakScore", 840488579);
        setIntField(term3993073, term3993073.getClass(), "syncRate", -523758018);
        setIntField(term3993073, term3993073.getClass(), "vsWin", -13675089);
        setBooleanField(term3993073, term3993073.getClass(), "isAllPerfect", false);
        setIntField(term3993073, term3993073.getClass(), "fullCombo", -1242864550);
        setIntField(term3993073, term3993073.getClass(), "maxFever", 357720632);
        setIntField(term3993073, term3993073.getClass(), "maxCombo", 1136567735);
        setIntField(term3993073, term3993073.getClass(), "tapPerfect", 1696150381);
        setIntField(term3993073, term3993073.getClass(), "tapGreat", 1322645760);
        setIntField(term3993073, term3993073.getClass(), "tapGood", -492128365);
        setIntField(term3993073, term3993073.getClass(), "tapBad", 2129728310);
        setIntField(term3993073, term3993073.getClass(), "holdPerfect", 1945698492);
        setIntField(term3993073, term3993073.getClass(), "holdGreat", 1945971426);
        setIntField(term3993073, term3993073.getClass(), "holdGood", 1968006423);
        setIntField(term3993073, term3993073.getClass(), "holdBad", 1116367385);
        setIntField(term3993073, term3993073.getClass(), "slidePerfect", -1680815042);
        setIntField(term3993073, term3993073.getClass(), "slideGreat", 1682429496);
        setIntField(term3993073, term3993073.getClass(), "slideGood", 19157567);
        setIntField(term3993073, term3993073.getClass(), "slideBad", -1189168508);
        setIntField(term3993073, term3993073.getClass(), "breakPerfect", 1474742913);
        setIntField(term3993073, term3993073.getClass(), "breakGreat", -583562483);
        setIntField(term3993073, term3993073.getClass(), "breakGood", 989859759);
        setIntField(term3993073, term3993073.getClass(), "breakBad", -522979448);
        setBooleanField(term3993073, term3993073.getClass(), "isTrackSkip", true);
        setBooleanField(term3993073, term3993073.getClass(), "isHighScore", false);
        setBooleanField(term3993073, term3993073.getClass(), "isChallengeTrack", true);
        setIntField(term3993073, term3993073.getClass(), "challengeLife", -571456689);
        setIntField(term3993073, term3993073.getClass(), "challengeRemain", -489090562);
        setIntField(term3993073, term3993073.getClass(), "isAllPerfectPlus", -302483795);
        term3993385 = new Integer(-1950870655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3993385;
        callMethod(klass, "setBreakGood", argTypes, term3993073, args);
    }

};


