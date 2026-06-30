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

public class UserPlaylog_setTapScore_155334611090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155331;
     Object term155643;

    public UserPlaylog_setTapScore_155334611090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term155337 = new Long(-997945615782059734L);
        term155331 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term155333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term155335 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term155351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155366 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term155331, term155331.getClass(), "id", -4876190539375195221L);
        setLongField(term155333, term155333.getClass(), "id", -5262639910779325902L);
        setLongField(term155335, term155335.getClass(), "id", 6267421205498097015L);
        setField(term155335, term155335.getClass(), "extId", term155337);
        setField(term155335, term155335.getClass(), "luid", "EPqrGqPuGp");
        setIntField(term155352, term155352.getClass(), "year", 2014);
        setShortField(term155352, term155352.getClass(), "month", (short) 3);
        setShortField(term155352, term155352.getClass(), "day", (short) 6);
        setField(term155351, term155351.getClass(), "date", term155352);
        setByteField(term155356, term155356.getClass(), "hour", (byte) 3);
        setByteField(term155356, term155356.getClass(), "minute", (byte) 21);
        setByteField(term155356, term155356.getClass(), "second", (byte) 53);
        setIntField(term155356, term155356.getClass(), "nano", 978038024);
        setField(term155351, term155351.getClass(), "time", term155356);
        setField(term155335, term155335.getClass(), "registerTime", term155351);
        setIntField(term155362, term155362.getClass(), "year", 2013);
        setShortField(term155362, term155362.getClass(), "month", (short) 5);
        setShortField(term155362, term155362.getClass(), "day", (short) 10);
        setField(term155361, term155361.getClass(), "date", term155362);
        setByteField(term155366, term155366.getClass(), "hour", (byte) 8);
        setByteField(term155366, term155366.getClass(), "minute", (byte) 51);
        setByteField(term155366, term155366.getClass(), "second", (byte) 38);
        setIntField(term155366, term155366.getClass(), "nano", 326978944);
        setField(term155361, term155361.getClass(), "time", term155366);
        setField(term155335, term155335.getClass(), "accessTime", term155361);
        setField(term155333, term155333.getClass(), "card", term155335);
        setIntField(term155333, term155333.getClass(), "lastDataVersion", -1410896763);
        setField(term155333, term155333.getClass(), "userName", "fevqUofURr");
        setIntField(term155333, term155333.getClass(), "point", 1096733578);
        setIntField(term155333, term155333.getClass(), "totalPoint", -1994019277);
        setIntField(term155333, term155333.getClass(), "iconId", 67033897);
        setIntField(term155333, term155333.getClass(), "nameplateId", -2096740582);
        setIntField(term155333, term155333.getClass(), "frameId", -1163791986);
        setIntField(term155333, term155333.getClass(), "trophyId", 1886209665);
        setIntField(term155333, term155333.getClass(), "playCount", -1949218758);
        setIntField(term155333, term155333.getClass(), "playVsCount", -253546603);
        setIntField(term155333, term155333.getClass(), "playSyncCount", -963517351);
        setIntField(term155333, term155333.getClass(), "winCount", 864055212);
        setIntField(term155333, term155333.getClass(), "helpCount", 1184807785);
        setIntField(term155333, term155333.getClass(), "comboCount", 735819860);
        setIntField(term155333, term155333.getClass(), "feverCount", -1670828262);
        setIntField(term155333, term155333.getClass(), "totalHiScore", 527256961);
        setIntField(term155333, term155333.getClass(), "totalEasyHighScore", -1777445737);
        setIntField(term155333, term155333.getClass(), "totalBasicHighScore", 1876169364);
        setIntField(term155333, term155333.getClass(), "totalAdvancedHighScore", -1400487724);
        setIntField(term155333, term155333.getClass(), "totalExpertHighScore", -1316616936);
        setIntField(term155333, term155333.getClass(), "totalMasterHighScore", 330384030);
        setIntField(term155333, term155333.getClass(), "totalReMasterHighScore", -2043022756);
        setIntField(term155333, term155333.getClass(), "totalHighSync", -258648971);
        setIntField(term155333, term155333.getClass(), "totalEasySync", 1123491164);
        setIntField(term155333, term155333.getClass(), "totalBasicSync", 745567108);
        setIntField(term155333, term155333.getClass(), "totalAdvancedSync", 133647513);
        setIntField(term155333, term155333.getClass(), "totalExpertSync", -1745895896);
        setIntField(term155333, term155333.getClass(), "totalMasterSync", 776266698);
        setIntField(term155333, term155333.getClass(), "totalReMasterSync", -1675062292);
        setIntField(term155333, term155333.getClass(), "playerRating", 1028674442);
        setIntField(term155333, term155333.getClass(), "highestRating", 772946407);
        setIntField(term155333, term155333.getClass(), "rankAuthTailId", 1119082872);
        setField(term155333, term155333.getClass(), "eventWatchedDate", "jvawePHFow");
        setField(term155333, term155333.getClass(), "webLimitDate", "qUypQjDKks");
        setIntField(term155333, term155333.getClass(), "challengeTrackPhase", 1522667983);
        setIntField(term155333, term155333.getClass(), "firstPlayBits", 964318558);
        setField(term155333, term155333.getClass(), "lastPlayDate", "VItjCXRpXX");
        setIntField(term155333, term155333.getClass(), "lastPlaceId", 1561399123);
        setField(term155333, term155333.getClass(), "lastPlaceName", "CuQvkbeIKF");
        setIntField(term155333, term155333.getClass(), "lastRegionId", -950244264);
        setField(term155333, term155333.getClass(), "lastRegionName", "JTDaVaJNVZ");
        setField(term155333, term155333.getClass(), "lastClientId", "SqbHVsvNsi");
        setField(term155333, term155333.getClass(), "lastCountryCode", "PCctsmeLnX");
        setIntField(term155333, term155333.getClass(), "eventPoint", 1723471468);
        setIntField(term155333, term155333.getClass(), "totalLv", 745496858);
        setIntField(term155333, term155333.getClass(), "lastLoginBonusDay", -1526063417);
        setIntField(term155333, term155333.getClass(), "lastSurvivalBonusDay", 1961525437);
        setIntField(term155333, term155333.getClass(), "loginBonusLv", 1861004157);
        setField(term155331, term155331.getClass(), "user", term155333);
        setIntField(term155331, term155331.getClass(), "orderId", -1352870464);
        setLongField(term155331, term155331.getClass(), "sortNumber", 2972970902155476483L);
        setIntField(term155331, term155331.getClass(), "placeId", 1761749930);
        setField(term155331, term155331.getClass(), "placeName", "mDPZZCKeJW");
        setField(term155331, term155331.getClass(), "country", "fLUSgXlneP");
        setIntField(term155331, term155331.getClass(), "regionId", 504205086);
        setField(term155331, term155331.getClass(), "playDate", "hKDHCIiSuI");
        setField(term155331, term155331.getClass(), "userPlayDate", "ZDvGrpCzSc");
        setIntField(term155331, term155331.getClass(), "musicId", -1379958870);
        setIntField(term155331, term155331.getClass(), "level", 893992877);
        setIntField(term155331, term155331.getClass(), "gameMode", -1164183548);
        setIntField(term155331, term155331.getClass(), "rivalNum", -1280943590);
        setIntField(term155331, term155331.getClass(), "track", 97517122);
        setIntField(term155331, term155331.getClass(), "eventId", -1670371262);
        setBooleanField(term155331, term155331.getClass(), "isFreeToPlay", false);
        setIntField(term155331, term155331.getClass(), "playerRating", 1575814483);
        setLongField(term155331, term155331.getClass(), "playedUserId1", -6060448108932211661L);
        setField(term155331, term155331.getClass(), "playedUserName1", "OseqIIMKlG");
        setIntField(term155331, term155331.getClass(), "playedMusicLevel1", -1492418372);
        setLongField(term155331, term155331.getClass(), "playedUserId2", -4280668709580845965L);
        setField(term155331, term155331.getClass(), "playedUserName2", "qOsyLpoLDX");
        setIntField(term155331, term155331.getClass(), "playedMusicLevel2", 1128181288);
        setLongField(term155331, term155331.getClass(), "playedUserId3", -8669140240741599474L);
        setField(term155331, term155331.getClass(), "playedUserName3", "ieESeaonzX");
        setIntField(term155331, term155331.getClass(), "playedMusicLevel3", -744965178);
        setIntField(term155331, term155331.getClass(), "achievement", -1365438817);
        setIntField(term155331, term155331.getClass(), "score", -1567723265);
        setIntField(term155331, term155331.getClass(), "tapScore", 668797963);
        setIntField(term155331, term155331.getClass(), "holdScore", 2073454987);
        setIntField(term155331, term155331.getClass(), "slideScore", -860188724);
        setIntField(term155331, term155331.getClass(), "breakScore", 721321620);
        setIntField(term155331, term155331.getClass(), "syncRate", -350071847);
        setIntField(term155331, term155331.getClass(), "vsWin", -1636769202);
        setBooleanField(term155331, term155331.getClass(), "isAllPerfect", true);
        setIntField(term155331, term155331.getClass(), "fullCombo", -1015026130);
        setIntField(term155331, term155331.getClass(), "maxFever", 75506146);
        setIntField(term155331, term155331.getClass(), "maxCombo", 471788916);
        setIntField(term155331, term155331.getClass(), "tapPerfect", -442296093);
        setIntField(term155331, term155331.getClass(), "tapGreat", 199890530);
        setIntField(term155331, term155331.getClass(), "tapGood", 1978311501);
        setIntField(term155331, term155331.getClass(), "tapBad", 1391292582);
        setIntField(term155331, term155331.getClass(), "holdPerfect", -306763503);
        setIntField(term155331, term155331.getClass(), "holdGreat", -910515365);
        setIntField(term155331, term155331.getClass(), "holdGood", -1874938182);
        setIntField(term155331, term155331.getClass(), "holdBad", 60519506);
        setIntField(term155331, term155331.getClass(), "slidePerfect", 1501513914);
        setIntField(term155331, term155331.getClass(), "slideGreat", -1467161925);
        setIntField(term155331, term155331.getClass(), "slideGood", 132959059);
        setIntField(term155331, term155331.getClass(), "slideBad", -1384932115);
        setIntField(term155331, term155331.getClass(), "breakPerfect", 1753884479);
        setIntField(term155331, term155331.getClass(), "breakGreat", 558254691);
        setIntField(term155331, term155331.getClass(), "breakGood", -1949691001);
        setIntField(term155331, term155331.getClass(), "breakBad", -499802581);
        setBooleanField(term155331, term155331.getClass(), "isTrackSkip", false);
        setBooleanField(term155331, term155331.getClass(), "isHighScore", false);
        setBooleanField(term155331, term155331.getClass(), "isChallengeTrack", true);
        setIntField(term155331, term155331.getClass(), "challengeLife", 91447074);
        setIntField(term155331, term155331.getClass(), "challengeRemain", -744475827);
        setIntField(term155331, term155331.getClass(), "isAllPerfectPlus", -1241544364);
        term155643 = new Integer(-2141182980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term155643;
        callMethod(klass, "setTapScore", argTypes, term155331, args);
    }

};


