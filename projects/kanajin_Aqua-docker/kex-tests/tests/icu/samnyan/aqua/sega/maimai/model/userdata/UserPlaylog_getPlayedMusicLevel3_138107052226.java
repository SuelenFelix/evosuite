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

public class UserPlaylog_getPlayedMusicLevel3_138107052226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124663;

    public UserPlaylog_getPlayedMusicLevel3_138107052226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term124669 = new Long(-7283193381993602128L);
        term124663 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term124665 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term124667 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term124683 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124684 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124688 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124698 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term124663, term124663.getClass(), "id", 6126964308136745488L);
        setLongField(term124665, term124665.getClass(), "id", -8307140005890062599L);
        setLongField(term124667, term124667.getClass(), "id", 195324792518519601L);
        setField(term124667, term124667.getClass(), "extId", term124669);
        setField(term124667, term124667.getClass(), "luid", "sCSkTLnMUp");
        setIntField(term124684, term124684.getClass(), "year", 2027);
        setShortField(term124684, term124684.getClass(), "month", (short) 2);
        setShortField(term124684, term124684.getClass(), "day", (short) 28);
        setField(term124683, term124683.getClass(), "date", term124684);
        setByteField(term124688, term124688.getClass(), "hour", (byte) 10);
        setByteField(term124688, term124688.getClass(), "minute", (byte) 42);
        setByteField(term124688, term124688.getClass(), "second", (byte) 49);
        setIntField(term124688, term124688.getClass(), "nano", 494945461);
        setField(term124683, term124683.getClass(), "time", term124688);
        setField(term124667, term124667.getClass(), "registerTime", term124683);
        setIntField(term124694, term124694.getClass(), "year", 2018);
        setShortField(term124694, term124694.getClass(), "month", (short) 3);
        setShortField(term124694, term124694.getClass(), "day", (short) 28);
        setField(term124693, term124693.getClass(), "date", term124694);
        setByteField(term124698, term124698.getClass(), "hour", (byte) 21);
        setByteField(term124698, term124698.getClass(), "minute", (byte) 12);
        setByteField(term124698, term124698.getClass(), "second", (byte) 31);
        setIntField(term124698, term124698.getClass(), "nano", 841920486);
        setField(term124693, term124693.getClass(), "time", term124698);
        setField(term124667, term124667.getClass(), "accessTime", term124693);
        setField(term124665, term124665.getClass(), "card", term124667);
        setIntField(term124665, term124665.getClass(), "lastDataVersion", -1957867547);
        setField(term124665, term124665.getClass(), "userName", "MGfUFAWSlA");
        setIntField(term124665, term124665.getClass(), "point", -518122142);
        setIntField(term124665, term124665.getClass(), "totalPoint", -310579253);
        setIntField(term124665, term124665.getClass(), "iconId", -1183783029);
        setIntField(term124665, term124665.getClass(), "nameplateId", -564323577);
        setIntField(term124665, term124665.getClass(), "frameId", -85068771);
        setIntField(term124665, term124665.getClass(), "trophyId", 456587803);
        setIntField(term124665, term124665.getClass(), "playCount", -576741867);
        setIntField(term124665, term124665.getClass(), "playVsCount", -1491604415);
        setIntField(term124665, term124665.getClass(), "playSyncCount", 240084685);
        setIntField(term124665, term124665.getClass(), "winCount", 1069708027);
        setIntField(term124665, term124665.getClass(), "helpCount", -1319422191);
        setIntField(term124665, term124665.getClass(), "comboCount", 1782477169);
        setIntField(term124665, term124665.getClass(), "feverCount", 547849357);
        setIntField(term124665, term124665.getClass(), "totalHiScore", 2045299937);
        setIntField(term124665, term124665.getClass(), "totalEasyHighScore", 2019732254);
        setIntField(term124665, term124665.getClass(), "totalBasicHighScore", 2070720689);
        setIntField(term124665, term124665.getClass(), "totalAdvancedHighScore", 301858314);
        setIntField(term124665, term124665.getClass(), "totalExpertHighScore", 2044006369);
        setIntField(term124665, term124665.getClass(), "totalMasterHighScore", 1371388714);
        setIntField(term124665, term124665.getClass(), "totalReMasterHighScore", -1277868307);
        setIntField(term124665, term124665.getClass(), "totalHighSync", -1386235254);
        setIntField(term124665, term124665.getClass(), "totalEasySync", 1272073315);
        setIntField(term124665, term124665.getClass(), "totalBasicSync", 2077327123);
        setIntField(term124665, term124665.getClass(), "totalAdvancedSync", -1638302794);
        setIntField(term124665, term124665.getClass(), "totalExpertSync", 811581744);
        setIntField(term124665, term124665.getClass(), "totalMasterSync", -562952939);
        setIntField(term124665, term124665.getClass(), "totalReMasterSync", 987544209);
        setIntField(term124665, term124665.getClass(), "playerRating", 1223573076);
        setIntField(term124665, term124665.getClass(), "highestRating", -723062147);
        setIntField(term124665, term124665.getClass(), "rankAuthTailId", -832912350);
        setField(term124665, term124665.getClass(), "eventWatchedDate", "eCRXbBPOdv");
        setField(term124665, term124665.getClass(), "webLimitDate", "eNcuSzCfin");
        setIntField(term124665, term124665.getClass(), "challengeTrackPhase", -571859886);
        setIntField(term124665, term124665.getClass(), "firstPlayBits", 1907056673);
        setField(term124665, term124665.getClass(), "lastPlayDate", "lujQENuAbC");
        setIntField(term124665, term124665.getClass(), "lastPlaceId", 1283937818);
        setField(term124665, term124665.getClass(), "lastPlaceName", "qkbmnArlda");
        setIntField(term124665, term124665.getClass(), "lastRegionId", 1766739875);
        setField(term124665, term124665.getClass(), "lastRegionName", "yvOcemZnPj");
        setField(term124665, term124665.getClass(), "lastClientId", "xAxPUWaeyn");
        setField(term124665, term124665.getClass(), "lastCountryCode", "QrXzPOoTMM");
        setIntField(term124665, term124665.getClass(), "eventPoint", -1903899802);
        setIntField(term124665, term124665.getClass(), "totalLv", 1038327828);
        setIntField(term124665, term124665.getClass(), "lastLoginBonusDay", 1418723540);
        setIntField(term124665, term124665.getClass(), "lastSurvivalBonusDay", 519713110);
        setIntField(term124665, term124665.getClass(), "loginBonusLv", -446830883);
        setField(term124663, term124663.getClass(), "user", term124665);
        setIntField(term124663, term124663.getClass(), "orderId", 410606492);
        setLongField(term124663, term124663.getClass(), "sortNumber", 8741861751389973987L);
        setIntField(term124663, term124663.getClass(), "placeId", 1382733542);
        setField(term124663, term124663.getClass(), "placeName", "ovDeGFzsPr");
        setField(term124663, term124663.getClass(), "country", "MetUQYZAvL");
        setIntField(term124663, term124663.getClass(), "regionId", 1612481933);
        setField(term124663, term124663.getClass(), "playDate", "TfZIVTqpIe");
        setField(term124663, term124663.getClass(), "userPlayDate", "DAYFgLtcSK");
        setIntField(term124663, term124663.getClass(), "musicId", 1607981998);
        setIntField(term124663, term124663.getClass(), "level", -745736018);
        setIntField(term124663, term124663.getClass(), "gameMode", -2137149826);
        setIntField(term124663, term124663.getClass(), "rivalNum", 380781928);
        setIntField(term124663, term124663.getClass(), "track", -1571375910);
        setIntField(term124663, term124663.getClass(), "eventId", 635395361);
        setBooleanField(term124663, term124663.getClass(), "isFreeToPlay", false);
        setIntField(term124663, term124663.getClass(), "playerRating", -1570990470);
        setLongField(term124663, term124663.getClass(), "playedUserId1", -6267867662540638557L);
        setField(term124663, term124663.getClass(), "playedUserName1", "yYSkqbbdqk");
        setIntField(term124663, term124663.getClass(), "playedMusicLevel1", -1149009850);
        setLongField(term124663, term124663.getClass(), "playedUserId2", 7789239238809338335L);
        setField(term124663, term124663.getClass(), "playedUserName2", "pZqOHvYzUt");
        setIntField(term124663, term124663.getClass(), "playedMusicLevel2", 797100496);
        setLongField(term124663, term124663.getClass(), "playedUserId3", 7148416754314775058L);
        setField(term124663, term124663.getClass(), "playedUserName3", "DtSvRdcfBd");
        setIntField(term124663, term124663.getClass(), "playedMusicLevel3", 387188537);
        setIntField(term124663, term124663.getClass(), "achievement", 2117289330);
        setIntField(term124663, term124663.getClass(), "score", -1716176776);
        setIntField(term124663, term124663.getClass(), "tapScore", -945983725);
        setIntField(term124663, term124663.getClass(), "holdScore", -1130128512);
        setIntField(term124663, term124663.getClass(), "slideScore", -735578886);
        setIntField(term124663, term124663.getClass(), "breakScore", 122672951);
        setIntField(term124663, term124663.getClass(), "syncRate", -1025667815);
        setIntField(term124663, term124663.getClass(), "vsWin", -1257702436);
        setBooleanField(term124663, term124663.getClass(), "isAllPerfect", true);
        setIntField(term124663, term124663.getClass(), "fullCombo", -249942744);
        setIntField(term124663, term124663.getClass(), "maxFever", 1696885720);
        setIntField(term124663, term124663.getClass(), "maxCombo", 1489256822);
        setIntField(term124663, term124663.getClass(), "tapPerfect", 1421884382);
        setIntField(term124663, term124663.getClass(), "tapGreat", -62634925);
        setIntField(term124663, term124663.getClass(), "tapGood", 946481725);
        setIntField(term124663, term124663.getClass(), "tapBad", 850914873);
        setIntField(term124663, term124663.getClass(), "holdPerfect", 1246758487);
        setIntField(term124663, term124663.getClass(), "holdGreat", 1022269214);
        setIntField(term124663, term124663.getClass(), "holdGood", -133112690);
        setIntField(term124663, term124663.getClass(), "holdBad", -734635114);
        setIntField(term124663, term124663.getClass(), "slidePerfect", 1091258417);
        setIntField(term124663, term124663.getClass(), "slideGreat", -1177568076);
        setIntField(term124663, term124663.getClass(), "slideGood", 2119973929);
        setIntField(term124663, term124663.getClass(), "slideBad", 617926596);
        setIntField(term124663, term124663.getClass(), "breakPerfect", 1992438907);
        setIntField(term124663, term124663.getClass(), "breakGreat", 428161876);
        setIntField(term124663, term124663.getClass(), "breakGood", -265853482);
        setIntField(term124663, term124663.getClass(), "breakBad", -1169211096);
        setBooleanField(term124663, term124663.getClass(), "isTrackSkip", false);
        setBooleanField(term124663, term124663.getClass(), "isHighScore", true);
        setBooleanField(term124663, term124663.getClass(), "isChallengeTrack", true);
        setIntField(term124663, term124663.getClass(), "challengeLife", 1551300037);
        setIntField(term124663, term124663.getClass(), "challengeRemain", -1203470065);
        setIntField(term124663, term124663.getClass(), "isAllPerfectPlus", 1164893503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel3", argTypes, term124663, args);
    }

};


