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

public class UserPlaylog_setPlayedMusicLevel2_6431592184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152467;
     Object term152779;

    public UserPlaylog_setPlayedMusicLevel2_6431592184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term152473 = new Long(1133267598258375793L);
        term152467 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term152469 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term152471 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term152487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152492 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152502 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term152467, term152467.getClass(), "id", -2692345938390249037L);
        setLongField(term152469, term152469.getClass(), "id", -5292926065434569211L);
        setLongField(term152471, term152471.getClass(), "id", 346757673772711087L);
        setField(term152471, term152471.getClass(), "extId", term152473);
        setField(term152471, term152471.getClass(), "luid", "QHAkxVuuIr");
        setIntField(term152488, term152488.getClass(), "year", 2014);
        setShortField(term152488, term152488.getClass(), "month", (short) 8);
        setShortField(term152488, term152488.getClass(), "day", (short) 10);
        setField(term152487, term152487.getClass(), "date", term152488);
        setByteField(term152492, term152492.getClass(), "hour", (byte) 17);
        setByteField(term152492, term152492.getClass(), "minute", (byte) 8);
        setByteField(term152492, term152492.getClass(), "second", (byte) 32);
        setIntField(term152492, term152492.getClass(), "nano", 120357006);
        setField(term152487, term152487.getClass(), "time", term152492);
        setField(term152471, term152471.getClass(), "registerTime", term152487);
        setIntField(term152498, term152498.getClass(), "year", 2029);
        setShortField(term152498, term152498.getClass(), "month", (short) 5);
        setShortField(term152498, term152498.getClass(), "day", (short) 3);
        setField(term152497, term152497.getClass(), "date", term152498);
        setByteField(term152502, term152502.getClass(), "hour", (byte) 21);
        setByteField(term152502, term152502.getClass(), "minute", (byte) 41);
        setByteField(term152502, term152502.getClass(), "second", (byte) 9);
        setIntField(term152502, term152502.getClass(), "nano", 699417700);
        setField(term152497, term152497.getClass(), "time", term152502);
        setField(term152471, term152471.getClass(), "accessTime", term152497);
        setField(term152469, term152469.getClass(), "card", term152471);
        setIntField(term152469, term152469.getClass(), "lastDataVersion", -1135769054);
        setField(term152469, term152469.getClass(), "userName", "OhJSELmFDf");
        setIntField(term152469, term152469.getClass(), "point", -692979647);
        setIntField(term152469, term152469.getClass(), "totalPoint", -115249332);
        setIntField(term152469, term152469.getClass(), "iconId", -559819958);
        setIntField(term152469, term152469.getClass(), "nameplateId", -1733671286);
        setIntField(term152469, term152469.getClass(), "frameId", -178140360);
        setIntField(term152469, term152469.getClass(), "trophyId", -163458934);
        setIntField(term152469, term152469.getClass(), "playCount", -1252231588);
        setIntField(term152469, term152469.getClass(), "playVsCount", -853031166);
        setIntField(term152469, term152469.getClass(), "playSyncCount", -1242117569);
        setIntField(term152469, term152469.getClass(), "winCount", 162192717);
        setIntField(term152469, term152469.getClass(), "helpCount", -761103236);
        setIntField(term152469, term152469.getClass(), "comboCount", 1016867156);
        setIntField(term152469, term152469.getClass(), "feverCount", -694394694);
        setIntField(term152469, term152469.getClass(), "totalHiScore", -155571099);
        setIntField(term152469, term152469.getClass(), "totalEasyHighScore", -688363981);
        setIntField(term152469, term152469.getClass(), "totalBasicHighScore", 1665916895);
        setIntField(term152469, term152469.getClass(), "totalAdvancedHighScore", 1369452206);
        setIntField(term152469, term152469.getClass(), "totalExpertHighScore", -1292644371);
        setIntField(term152469, term152469.getClass(), "totalMasterHighScore", 397443548);
        setIntField(term152469, term152469.getClass(), "totalReMasterHighScore", 309132952);
        setIntField(term152469, term152469.getClass(), "totalHighSync", -1556386958);
        setIntField(term152469, term152469.getClass(), "totalEasySync", 559879159);
        setIntField(term152469, term152469.getClass(), "totalBasicSync", -1344311431);
        setIntField(term152469, term152469.getClass(), "totalAdvancedSync", -1239165871);
        setIntField(term152469, term152469.getClass(), "totalExpertSync", -897368154);
        setIntField(term152469, term152469.getClass(), "totalMasterSync", -291634329);
        setIntField(term152469, term152469.getClass(), "totalReMasterSync", -1846243901);
        setIntField(term152469, term152469.getClass(), "playerRating", -1411820482);
        setIntField(term152469, term152469.getClass(), "highestRating", 1823492708);
        setIntField(term152469, term152469.getClass(), "rankAuthTailId", -1140992225);
        setField(term152469, term152469.getClass(), "eventWatchedDate", "WjtvlnduZO");
        setField(term152469, term152469.getClass(), "webLimitDate", "EccuEVvNyG");
        setIntField(term152469, term152469.getClass(), "challengeTrackPhase", 1321444482);
        setIntField(term152469, term152469.getClass(), "firstPlayBits", -1915743308);
        setField(term152469, term152469.getClass(), "lastPlayDate", "kqWUPOtRYQ");
        setIntField(term152469, term152469.getClass(), "lastPlaceId", -935541323);
        setField(term152469, term152469.getClass(), "lastPlaceName", "vtFFfsxqsd");
        setIntField(term152469, term152469.getClass(), "lastRegionId", -352537764);
        setField(term152469, term152469.getClass(), "lastRegionName", "OgafASdxEn");
        setField(term152469, term152469.getClass(), "lastClientId", "SdEDpqIgHG");
        setField(term152469, term152469.getClass(), "lastCountryCode", "KiOHPfuKbp");
        setIntField(term152469, term152469.getClass(), "eventPoint", 902717471);
        setIntField(term152469, term152469.getClass(), "totalLv", 1004855346);
        setIntField(term152469, term152469.getClass(), "lastLoginBonusDay", 962330182);
        setIntField(term152469, term152469.getClass(), "lastSurvivalBonusDay", -878487713);
        setIntField(term152469, term152469.getClass(), "loginBonusLv", -932089225);
        setField(term152467, term152467.getClass(), "user", term152469);
        setIntField(term152467, term152467.getClass(), "orderId", -1934347867);
        setLongField(term152467, term152467.getClass(), "sortNumber", -1912308523656007793L);
        setIntField(term152467, term152467.getClass(), "placeId", -1706749349);
        setField(term152467, term152467.getClass(), "placeName", "faneZfiPkz");
        setField(term152467, term152467.getClass(), "country", "xKSrJBCTXk");
        setIntField(term152467, term152467.getClass(), "regionId", 1691853647);
        setField(term152467, term152467.getClass(), "playDate", "GbWyFVlZnY");
        setField(term152467, term152467.getClass(), "userPlayDate", "DUXodxIhLc");
        setIntField(term152467, term152467.getClass(), "musicId", 1333947633);
        setIntField(term152467, term152467.getClass(), "level", 908983527);
        setIntField(term152467, term152467.getClass(), "gameMode", -1560925180);
        setIntField(term152467, term152467.getClass(), "rivalNum", 1622612061);
        setIntField(term152467, term152467.getClass(), "track", 640198610);
        setIntField(term152467, term152467.getClass(), "eventId", -1523209592);
        setBooleanField(term152467, term152467.getClass(), "isFreeToPlay", false);
        setIntField(term152467, term152467.getClass(), "playerRating", -457921907);
        setLongField(term152467, term152467.getClass(), "playedUserId1", 1577272117979272714L);
        setField(term152467, term152467.getClass(), "playedUserName1", "LfEDxfBelf");
        setIntField(term152467, term152467.getClass(), "playedMusicLevel1", 374781737);
        setLongField(term152467, term152467.getClass(), "playedUserId2", 2167034694898722303L);
        setField(term152467, term152467.getClass(), "playedUserName2", "VGpvGtWXWx");
        setIntField(term152467, term152467.getClass(), "playedMusicLevel2", -24327473);
        setLongField(term152467, term152467.getClass(), "playedUserId3", 5116667900739377769L);
        setField(term152467, term152467.getClass(), "playedUserName3", "SzRPOLwctZ");
        setIntField(term152467, term152467.getClass(), "playedMusicLevel3", 830748113);
        setIntField(term152467, term152467.getClass(), "achievement", 417460026);
        setIntField(term152467, term152467.getClass(), "score", 406315107);
        setIntField(term152467, term152467.getClass(), "tapScore", -627062045);
        setIntField(term152467, term152467.getClass(), "holdScore", -1445021691);
        setIntField(term152467, term152467.getClass(), "slideScore", 805552435);
        setIntField(term152467, term152467.getClass(), "breakScore", -510125131);
        setIntField(term152467, term152467.getClass(), "syncRate", -1779207838);
        setIntField(term152467, term152467.getClass(), "vsWin", 1830020074);
        setBooleanField(term152467, term152467.getClass(), "isAllPerfect", true);
        setIntField(term152467, term152467.getClass(), "fullCombo", 140147901);
        setIntField(term152467, term152467.getClass(), "maxFever", 515631328);
        setIntField(term152467, term152467.getClass(), "maxCombo", -357842866);
        setIntField(term152467, term152467.getClass(), "tapPerfect", -1168689785);
        setIntField(term152467, term152467.getClass(), "tapGreat", -1840348757);
        setIntField(term152467, term152467.getClass(), "tapGood", -340590811);
        setIntField(term152467, term152467.getClass(), "tapBad", -1540241431);
        setIntField(term152467, term152467.getClass(), "holdPerfect", 800643630);
        setIntField(term152467, term152467.getClass(), "holdGreat", -1079929581);
        setIntField(term152467, term152467.getClass(), "holdGood", 873897701);
        setIntField(term152467, term152467.getClass(), "holdBad", -607796853);
        setIntField(term152467, term152467.getClass(), "slidePerfect", 1810207932);
        setIntField(term152467, term152467.getClass(), "slideGreat", 803744323);
        setIntField(term152467, term152467.getClass(), "slideGood", -215426677);
        setIntField(term152467, term152467.getClass(), "slideBad", 1586987957);
        setIntField(term152467, term152467.getClass(), "breakPerfect", -649453025);
        setIntField(term152467, term152467.getClass(), "breakGreat", -1667643659);
        setIntField(term152467, term152467.getClass(), "breakGood", 1757803433);
        setIntField(term152467, term152467.getClass(), "breakBad", -940989595);
        setBooleanField(term152467, term152467.getClass(), "isTrackSkip", false);
        setBooleanField(term152467, term152467.getClass(), "isHighScore", false);
        setBooleanField(term152467, term152467.getClass(), "isChallengeTrack", true);
        setIntField(term152467, term152467.getClass(), "challengeLife", -261496296);
        setIntField(term152467, term152467.getClass(), "challengeRemain", -2142832958);
        setIntField(term152467, term152467.getClass(), "isAllPerfectPlus", -888715935);
        term152779 = new Integer(221566635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term152779;
        callMethod(klass, "setPlayedMusicLevel2", argTypes, term152467, args);
    }

};


