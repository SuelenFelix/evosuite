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

public class UserPlaylog_setTapGreat_1101221629102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160601;
     Object term160913;

    public UserPlaylog_setTapGreat_1101221629102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term160607 = new Long(-6489405551733780896L);
        term160601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term160603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term160605 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term160621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160636 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term160601, term160601.getClass(), "id", -3080436486706724387L);
        setLongField(term160603, term160603.getClass(), "id", -4645138191058941101L);
        setLongField(term160605, term160605.getClass(), "id", -7214804908928828361L);
        setField(term160605, term160605.getClass(), "extId", term160607);
        setField(term160605, term160605.getClass(), "luid", "DfiGFdKcma");
        setIntField(term160622, term160622.getClass(), "year", 2025);
        setShortField(term160622, term160622.getClass(), "month", (short) 5);
        setShortField(term160622, term160622.getClass(), "day", (short) 26);
        setField(term160621, term160621.getClass(), "date", term160622);
        setByteField(term160626, term160626.getClass(), "hour", (byte) 20);
        setByteField(term160626, term160626.getClass(), "minute", (byte) 9);
        setByteField(term160626, term160626.getClass(), "second", (byte) 33);
        setIntField(term160626, term160626.getClass(), "nano", 28360372);
        setField(term160621, term160621.getClass(), "time", term160626);
        setField(term160605, term160605.getClass(), "registerTime", term160621);
        setIntField(term160632, term160632.getClass(), "year", 2012);
        setShortField(term160632, term160632.getClass(), "month", (short) 6);
        setShortField(term160632, term160632.getClass(), "day", (short) 6);
        setField(term160631, term160631.getClass(), "date", term160632);
        setByteField(term160636, term160636.getClass(), "hour", (byte) 2);
        setByteField(term160636, term160636.getClass(), "minute", (byte) 48);
        setByteField(term160636, term160636.getClass(), "second", (byte) 6);
        setIntField(term160636, term160636.getClass(), "nano", 755935785);
        setField(term160631, term160631.getClass(), "time", term160636);
        setField(term160605, term160605.getClass(), "accessTime", term160631);
        setField(term160603, term160603.getClass(), "card", term160605);
        setIntField(term160603, term160603.getClass(), "lastDataVersion", -1957328402);
        setField(term160603, term160603.getClass(), "userName", "rUpZXYuqUO");
        setIntField(term160603, term160603.getClass(), "point", -1456311465);
        setIntField(term160603, term160603.getClass(), "totalPoint", 1470612514);
        setIntField(term160603, term160603.getClass(), "iconId", 959853757);
        setIntField(term160603, term160603.getClass(), "nameplateId", -870243697);
        setIntField(term160603, term160603.getClass(), "frameId", 558911092);
        setIntField(term160603, term160603.getClass(), "trophyId", 943192385);
        setIntField(term160603, term160603.getClass(), "playCount", 1818544138);
        setIntField(term160603, term160603.getClass(), "playVsCount", 1469540651);
        setIntField(term160603, term160603.getClass(), "playSyncCount", 1380762462);
        setIntField(term160603, term160603.getClass(), "winCount", -703131322);
        setIntField(term160603, term160603.getClass(), "helpCount", 292406316);
        setIntField(term160603, term160603.getClass(), "comboCount", -1515574764);
        setIntField(term160603, term160603.getClass(), "feverCount", 881695692);
        setIntField(term160603, term160603.getClass(), "totalHiScore", -1060073489);
        setIntField(term160603, term160603.getClass(), "totalEasyHighScore", -1571842288);
        setIntField(term160603, term160603.getClass(), "totalBasicHighScore", 2022139916);
        setIntField(term160603, term160603.getClass(), "totalAdvancedHighScore", 1561510486);
        setIntField(term160603, term160603.getClass(), "totalExpertHighScore", -142957283);
        setIntField(term160603, term160603.getClass(), "totalMasterHighScore", 1910560847);
        setIntField(term160603, term160603.getClass(), "totalReMasterHighScore", -1435563017);
        setIntField(term160603, term160603.getClass(), "totalHighSync", -1354905069);
        setIntField(term160603, term160603.getClass(), "totalEasySync", 565724582);
        setIntField(term160603, term160603.getClass(), "totalBasicSync", -1888267413);
        setIntField(term160603, term160603.getClass(), "totalAdvancedSync", 67591122);
        setIntField(term160603, term160603.getClass(), "totalExpertSync", -1030239102);
        setIntField(term160603, term160603.getClass(), "totalMasterSync", -259818135);
        setIntField(term160603, term160603.getClass(), "totalReMasterSync", -987303336);
        setIntField(term160603, term160603.getClass(), "playerRating", -1374851869);
        setIntField(term160603, term160603.getClass(), "highestRating", 830259629);
        setIntField(term160603, term160603.getClass(), "rankAuthTailId", 125980322);
        setField(term160603, term160603.getClass(), "eventWatchedDate", "PyCZLyLBQT");
        setField(term160603, term160603.getClass(), "webLimitDate", "IVHMBjnDQQ");
        setIntField(term160603, term160603.getClass(), "challengeTrackPhase", -350073794);
        setIntField(term160603, term160603.getClass(), "firstPlayBits", 90047794);
        setField(term160603, term160603.getClass(), "lastPlayDate", "CjQVEkBwOV");
        setIntField(term160603, term160603.getClass(), "lastPlaceId", 1247917707);
        setField(term160603, term160603.getClass(), "lastPlaceName", "IMmDkISmvo");
        setIntField(term160603, term160603.getClass(), "lastRegionId", 1761194622);
        setField(term160603, term160603.getClass(), "lastRegionName", "LBkNRvzfMR");
        setField(term160603, term160603.getClass(), "lastClientId", "AGyEIGYbwx");
        setField(term160603, term160603.getClass(), "lastCountryCode", "nOkegthvTo");
        setIntField(term160603, term160603.getClass(), "eventPoint", 285138045);
        setIntField(term160603, term160603.getClass(), "totalLv", -1490640841);
        setIntField(term160603, term160603.getClass(), "lastLoginBonusDay", -1193441882);
        setIntField(term160603, term160603.getClass(), "lastSurvivalBonusDay", -1281913103);
        setIntField(term160603, term160603.getClass(), "loginBonusLv", -1223481871);
        setField(term160601, term160601.getClass(), "user", term160603);
        setIntField(term160601, term160601.getClass(), "orderId", -338326828);
        setLongField(term160601, term160601.getClass(), "sortNumber", 8330781560568888679L);
        setIntField(term160601, term160601.getClass(), "placeId", -202246659);
        setField(term160601, term160601.getClass(), "placeName", "QIBFEnRCeZ");
        setField(term160601, term160601.getClass(), "country", "HVMLhVrWly");
        setIntField(term160601, term160601.getClass(), "regionId", -75123257);
        setField(term160601, term160601.getClass(), "playDate", "yVHTwpMOSD");
        setField(term160601, term160601.getClass(), "userPlayDate", "ZFThLVgXzT");
        setIntField(term160601, term160601.getClass(), "musicId", -886749578);
        setIntField(term160601, term160601.getClass(), "level", 1700481668);
        setIntField(term160601, term160601.getClass(), "gameMode", -24288213);
        setIntField(term160601, term160601.getClass(), "rivalNum", 1690648825);
        setIntField(term160601, term160601.getClass(), "track", 1807007406);
        setIntField(term160601, term160601.getClass(), "eventId", 1874772949);
        setBooleanField(term160601, term160601.getClass(), "isFreeToPlay", true);
        setIntField(term160601, term160601.getClass(), "playerRating", 471554503);
        setLongField(term160601, term160601.getClass(), "playedUserId1", -4718136580123793528L);
        setField(term160601, term160601.getClass(), "playedUserName1", "wpSuVLuVSu");
        setIntField(term160601, term160601.getClass(), "playedMusicLevel1", 888332353);
        setLongField(term160601, term160601.getClass(), "playedUserId2", 5370230694464734941L);
        setField(term160601, term160601.getClass(), "playedUserName2", "BauBYWlTXL");
        setIntField(term160601, term160601.getClass(), "playedMusicLevel2", -1296928255);
        setLongField(term160601, term160601.getClass(), "playedUserId3", -1887513396695229317L);
        setField(term160601, term160601.getClass(), "playedUserName3", "dAoPTQFCFN");
        setIntField(term160601, term160601.getClass(), "playedMusicLevel3", 1294521363);
        setIntField(term160601, term160601.getClass(), "achievement", -142821618);
        setIntField(term160601, term160601.getClass(), "score", -74847248);
        setIntField(term160601, term160601.getClass(), "tapScore", 1349133029);
        setIntField(term160601, term160601.getClass(), "holdScore", 1738756677);
        setIntField(term160601, term160601.getClass(), "slideScore", -1255779649);
        setIntField(term160601, term160601.getClass(), "breakScore", -356167425);
        setIntField(term160601, term160601.getClass(), "syncRate", 1909518175);
        setIntField(term160601, term160601.getClass(), "vsWin", 638757725);
        setBooleanField(term160601, term160601.getClass(), "isAllPerfect", true);
        setIntField(term160601, term160601.getClass(), "fullCombo", -72403898);
        setIntField(term160601, term160601.getClass(), "maxFever", 362457699);
        setIntField(term160601, term160601.getClass(), "maxCombo", -291466808);
        setIntField(term160601, term160601.getClass(), "tapPerfect", -1229943382);
        setIntField(term160601, term160601.getClass(), "tapGreat", 117820444);
        setIntField(term160601, term160601.getClass(), "tapGood", 574430116);
        setIntField(term160601, term160601.getClass(), "tapBad", -1277204012);
        setIntField(term160601, term160601.getClass(), "holdPerfect", 1791055761);
        setIntField(term160601, term160601.getClass(), "holdGreat", -602550675);
        setIntField(term160601, term160601.getClass(), "holdGood", 291160240);
        setIntField(term160601, term160601.getClass(), "holdBad", -1158573616);
        setIntField(term160601, term160601.getClass(), "slidePerfect", -727368325);
        setIntField(term160601, term160601.getClass(), "slideGreat", 320771066);
        setIntField(term160601, term160601.getClass(), "slideGood", 169920236);
        setIntField(term160601, term160601.getClass(), "slideBad", 206537770);
        setIntField(term160601, term160601.getClass(), "breakPerfect", 369187601);
        setIntField(term160601, term160601.getClass(), "breakGreat", -124508864);
        setIntField(term160601, term160601.getClass(), "breakGood", 121602955);
        setIntField(term160601, term160601.getClass(), "breakBad", -2084367050);
        setBooleanField(term160601, term160601.getClass(), "isTrackSkip", false);
        setBooleanField(term160601, term160601.getClass(), "isHighScore", false);
        setBooleanField(term160601, term160601.getClass(), "isChallengeTrack", false);
        setIntField(term160601, term160601.getClass(), "challengeLife", 1858872230);
        setIntField(term160601, term160601.getClass(), "challengeRemain", -446475302);
        setIntField(term160601, term160601.getClass(), "isAllPerfectPlus", -1159128285);
        term160913 = new Integer(-2100050641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term160913;
        callMethod(klass, "setTapGreat", argTypes, term160601, args);
    }

};


