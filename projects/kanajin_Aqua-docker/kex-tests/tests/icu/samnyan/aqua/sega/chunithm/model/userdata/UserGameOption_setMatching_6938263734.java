package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOption_setMatching_6938263734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64463;
     Object term64763;

    public UserGameOption_setMatching_6938263734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64469 = new Long(-6342139649364011743L);
        term64463 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term64465 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term64467 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term64483 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64484 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64488 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64493 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64494 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64498 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64520 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64581 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64629 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64675 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term64463, term64463.getClass(), "id", -239911533409145775L);
        setLongField(term64465, term64465.getClass(), "id", -474777108082218360L);
        setLongField(term64467, term64467.getClass(), "id", -7235419481645807819L);
        setField(term64467, term64467.getClass(), "extId", term64469);
        setField(term64467, term64467.getClass(), "luid", "CiPMRxGoHO");
        setIntField(term64484, term64484.getClass(), "year", 2025);
        setShortField(term64484, term64484.getClass(), "month", (short) 10);
        setShortField(term64484, term64484.getClass(), "day", (short) 12);
        setField(term64483, term64483.getClass(), "date", term64484);
        setByteField(term64488, term64488.getClass(), "hour", (byte) 0);
        setByteField(term64488, term64488.getClass(), "minute", (byte) 58);
        setByteField(term64488, term64488.getClass(), "second", (byte) 44);
        setIntField(term64488, term64488.getClass(), "nano", 42807662);
        setField(term64483, term64483.getClass(), "time", term64488);
        setField(term64467, term64467.getClass(), "registerTime", term64483);
        setIntField(term64494, term64494.getClass(), "year", 2026);
        setShortField(term64494, term64494.getClass(), "month", (short) 3);
        setShortField(term64494, term64494.getClass(), "day", (short) 23);
        setField(term64493, term64493.getClass(), "date", term64494);
        setByteField(term64498, term64498.getClass(), "hour", (byte) 21);
        setByteField(term64498, term64498.getClass(), "minute", (byte) 25);
        setByteField(term64498, term64498.getClass(), "second", (byte) 41);
        setIntField(term64498, term64498.getClass(), "nano", 714890677);
        setField(term64493, term64493.getClass(), "time", term64498);
        setField(term64467, term64467.getClass(), "accessTime", term64493);
        setField(term64465, term64465.getClass(), "card", term64467);
        setField(term64465, term64465.getClass(), "userName", "LauKpKmenw");
        setIntField(term64516, term64516.getClass(), "year", 2029);
        setShortField(term64516, term64516.getClass(), "month", (short) 11);
        setShortField(term64516, term64516.getClass(), "day", (short) 25);
        setField(term64515, term64515.getClass(), "date", term64516);
        setByteField(term64520, term64520.getClass(), "hour", (byte) 14);
        setByteField(term64520, term64520.getClass(), "minute", (byte) 49);
        setByteField(term64520, term64520.getClass(), "second", (byte) 17);
        setIntField(term64520, term64520.getClass(), "nano", 699722589);
        setField(term64515, term64515.getClass(), "time", term64520);
        setField(term64465, term64465.getClass(), "lastLoginDate", term64515);
        setBooleanField(term64465, term64465.getClass(), "isWebJoin", true);
        setField(term64465, term64465.getClass(), "webLimitDate", "TydzbTXvbY");
        setIntField(term64465, term64465.getClass(), "level", -1111349476);
        setIntField(term64465, term64465.getClass(), "reincarnationNum", 742969465);
        setField(term64465, term64465.getClass(), "exp", "yNogNNecFu");
        setLongField(term64465, term64465.getClass(), "point", -6917021920287966282L);
        setLongField(term64465, term64465.getClass(), "totalPoint", 4137076813890606231L);
        setIntField(term64465, term64465.getClass(), "playCount", -1810335427);
        setIntField(term64465, term64465.getClass(), "multiPlayCount", 803994786);
        setIntField(term64465, term64465.getClass(), "multiWinCount", -1141611223);
        setIntField(term64465, term64465.getClass(), "requestResCount", -1637961050);
        setIntField(term64465, term64465.getClass(), "acceptResCount", 1515109550);
        setIntField(term64465, term64465.getClass(), "successResCount", 1249494915);
        setIntField(term64465, term64465.getClass(), "playerRating", 1840485574);
        setIntField(term64465, term64465.getClass(), "highestRating", -1384928271);
        setIntField(term64465, term64465.getClass(), "nameplateId", 1760478472);
        setIntField(term64465, term64465.getClass(), "frameId", 611874985);
        setIntField(term64465, term64465.getClass(), "characterId", -1490909009);
        setIntField(term64465, term64465.getClass(), "trophyId", -1045578030);
        setIntField(term64465, term64465.getClass(), "playedTutorialBit", 1595269473);
        setIntField(term64465, term64465.getClass(), "firstTutorialCancelNum", 1542667674);
        setIntField(term64465, term64465.getClass(), "masterTutorialCancelNum", 1314061353);
        setIntField(term64465, term64465.getClass(), "totalRepertoireCount", 1341217092);
        setIntField(term64465, term64465.getClass(), "totalMapNum", -1945365712);
        setLongField(term64465, term64465.getClass(), "totalHiScore", -562805980132245735L);
        setLongField(term64465, term64465.getClass(), "totalBasicHighScore", 1095152021713790235L);
        setLongField(term64465, term64465.getClass(), "totalAdvancedHighScore", 9070668522488722105L);
        setLongField(term64465, term64465.getClass(), "totalExpertHighScore", 1784073150606702821L);
        setLongField(term64465, term64465.getClass(), "totalMasterHighScore", -3116269489103564104L);
        setIntField(term64577, term64577.getClass(), "year", 2026);
        setShortField(term64577, term64577.getClass(), "month", (short) 10);
        setShortField(term64577, term64577.getClass(), "day", (short) 4);
        setField(term64576, term64576.getClass(), "date", term64577);
        setByteField(term64581, term64581.getClass(), "hour", (byte) 6);
        setByteField(term64581, term64581.getClass(), "minute", (byte) 41);
        setByteField(term64581, term64581.getClass(), "second", (byte) 50);
        setIntField(term64581, term64581.getClass(), "nano", 414376807);
        setField(term64576, term64576.getClass(), "time", term64581);
        setField(term64465, term64465.getClass(), "eventWatchedDate", term64576);
        setIntField(term64465, term64465.getClass(), "friendCount", -746947278);
        setBooleanField(term64465, term64465.getClass(), "isMaimai", false);
        setField(term64465, term64465.getClass(), "firstGameId", "tcaaotqgDF");
        setField(term64465, term64465.getClass(), "firstRomVersion", "bXInWdOeyi");
        setField(term64465, term64465.getClass(), "firstDataVersion", "HdwopulXkf");
        setIntField(term64625, term64625.getClass(), "year", 2016);
        setShortField(term64625, term64625.getClass(), "month", (short) 4);
        setShortField(term64625, term64625.getClass(), "day", (short) 16);
        setField(term64624, term64624.getClass(), "date", term64625);
        setByteField(term64629, term64629.getClass(), "hour", (byte) 16);
        setByteField(term64629, term64629.getClass(), "minute", (byte) 43);
        setByteField(term64629, term64629.getClass(), "second", (byte) 51);
        setIntField(term64629, term64629.getClass(), "nano", 40671521);
        setField(term64624, term64624.getClass(), "time", term64629);
        setField(term64465, term64465.getClass(), "firstPlayDate", term64624);
        setField(term64465, term64465.getClass(), "lastGameId", "FuCKfgAhpC");
        setField(term64465, term64465.getClass(), "lastRomVersion", "gqMysJhxfA");
        setField(term64465, term64465.getClass(), "lastDataVersion", "HtLEppUqzI");
        setIntField(term64671, term64671.getClass(), "year", 2028);
        setShortField(term64671, term64671.getClass(), "month", (short) 7);
        setShortField(term64671, term64671.getClass(), "day", (short) 13);
        setField(term64670, term64670.getClass(), "date", term64671);
        setByteField(term64675, term64675.getClass(), "hour", (byte) 9);
        setByteField(term64675, term64675.getClass(), "minute", (byte) 46);
        setByteField(term64675, term64675.getClass(), "second", (byte) 40);
        setIntField(term64675, term64675.getClass(), "nano", 919051236);
        setField(term64670, term64670.getClass(), "time", term64675);
        setField(term64465, term64465.getClass(), "lastPlayDate", term64670);
        setIntField(term64465, term64465.getClass(), "lastPlaceId", 799648581);
        setField(term64465, term64465.getClass(), "lastPlaceName", "bVlRrMQeRY");
        setField(term64465, term64465.getClass(), "lastRegionId", "SXaXhlzAIB");
        setField(term64465, term64465.getClass(), "lastRegionName", "UPVTXSXUNh");
        setField(term64465, term64465.getClass(), "lastAllNetId", "cjCXbXuiFn");
        setField(term64465, term64465.getClass(), "lastClientId", "fhdhDeWdoi");
        setField(term64463, term64463.getClass(), "user", term64465);
        setIntField(term64463, term64463.getClass(), "bgInfo", -1929592392);
        setIntField(term64463, term64463.getClass(), "fieldColor", -557536719);
        setIntField(term64463, term64463.getClass(), "guideSound", -1507520585);
        setIntField(term64463, term64463.getClass(), "soundEffect", 87370597);
        setIntField(term64463, term64463.getClass(), "guideLine", -1516708019);
        setIntField(term64463, term64463.getClass(), "speed", 1316108940);
        setIntField(term64463, term64463.getClass(), "optionSet", -1092328406);
        setIntField(term64463, term64463.getClass(), "matching", -1065662465);
        setIntField(term64463, term64463.getClass(), "judgePos", 689033534);
        setIntField(term64463, term64463.getClass(), "rating", -1092529867);
        setIntField(term64463, term64463.getClass(), "judgeJustice", -1788533025);
        setIntField(term64463, term64463.getClass(), "judgeAttack", -1271339104);
        setIntField(term64463, term64463.getClass(), "headphone", -815986276);
        setIntField(term64463, term64463.getClass(), "playerLevel", 1352632981);
        setIntField(term64463, term64463.getClass(), "successTap", -2076492465);
        setIntField(term64463, term64463.getClass(), "successExTap", -926106316);
        setIntField(term64463, term64463.getClass(), "successSlideHold", 142204732);
        setIntField(term64463, term64463.getClass(), "successAir", 1428877162);
        setIntField(term64463, term64463.getClass(), "successFlick", -1464784083);
        setIntField(term64463, term64463.getClass(), "successSkill", -1564128892);
        setIntField(term64463, term64463.getClass(), "successTapTimbre", -638268686);
        setIntField(term64463, term64463.getClass(), "privacy", 213892075);
        term64763 = new Integer(1635792054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term64763;
        callMethod(klass, "setMatching", argTypes, term64463, args);
    }

};


