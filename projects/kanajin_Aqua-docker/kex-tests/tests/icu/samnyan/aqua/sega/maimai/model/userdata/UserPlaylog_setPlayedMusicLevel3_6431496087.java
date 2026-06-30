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

public class UserPlaylog_setPlayedMusicLevel3_6431496087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153909;
     Object term154221;

    public UserPlaylog_setPlayedMusicLevel3_6431496087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term153915 = new Long(6142089107139955834L);
        term153909 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term153911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term153913 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term153929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153934 = newInstance(Class.forName("java.time.LocalTime"));
        Object term153939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term153944 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term153909, term153909.getClass(), "id", -992268380840969737L);
        setLongField(term153911, term153911.getClass(), "id", 476691819773991950L);
        setLongField(term153913, term153913.getClass(), "id", 1984510319790430917L);
        setField(term153913, term153913.getClass(), "extId", term153915);
        setField(term153913, term153913.getClass(), "luid", "jttexnFOYa");
        setIntField(term153930, term153930.getClass(), "year", 2015);
        setShortField(term153930, term153930.getClass(), "month", (short) 7);
        setShortField(term153930, term153930.getClass(), "day", (short) 20);
        setField(term153929, term153929.getClass(), "date", term153930);
        setByteField(term153934, term153934.getClass(), "hour", (byte) 12);
        setByteField(term153934, term153934.getClass(), "minute", (byte) 3);
        setByteField(term153934, term153934.getClass(), "second", (byte) 51);
        setIntField(term153934, term153934.getClass(), "nano", 425566548);
        setField(term153929, term153929.getClass(), "time", term153934);
        setField(term153913, term153913.getClass(), "registerTime", term153929);
        setIntField(term153940, term153940.getClass(), "year", 2029);
        setShortField(term153940, term153940.getClass(), "month", (short) 10);
        setShortField(term153940, term153940.getClass(), "day", (short) 28);
        setField(term153939, term153939.getClass(), "date", term153940);
        setByteField(term153944, term153944.getClass(), "hour", (byte) 3);
        setByteField(term153944, term153944.getClass(), "minute", (byte) 8);
        setByteField(term153944, term153944.getClass(), "second", (byte) 59);
        setIntField(term153944, term153944.getClass(), "nano", 94100073);
        setField(term153939, term153939.getClass(), "time", term153944);
        setField(term153913, term153913.getClass(), "accessTime", term153939);
        setField(term153911, term153911.getClass(), "card", term153913);
        setIntField(term153911, term153911.getClass(), "lastDataVersion", 825427459);
        setField(term153911, term153911.getClass(), "userName", "VTcNUeCrHP");
        setIntField(term153911, term153911.getClass(), "point", 505521116);
        setIntField(term153911, term153911.getClass(), "totalPoint", -353874424);
        setIntField(term153911, term153911.getClass(), "iconId", -721707981);
        setIntField(term153911, term153911.getClass(), "nameplateId", 1346971567);
        setIntField(term153911, term153911.getClass(), "frameId", -502388706);
        setIntField(term153911, term153911.getClass(), "trophyId", 1976161701);
        setIntField(term153911, term153911.getClass(), "playCount", -1977526597);
        setIntField(term153911, term153911.getClass(), "playVsCount", 1883301310);
        setIntField(term153911, term153911.getClass(), "playSyncCount", -1438238840);
        setIntField(term153911, term153911.getClass(), "winCount", 2033365155);
        setIntField(term153911, term153911.getClass(), "helpCount", -1071499987);
        setIntField(term153911, term153911.getClass(), "comboCount", 1078047837);
        setIntField(term153911, term153911.getClass(), "feverCount", 1043292494);
        setIntField(term153911, term153911.getClass(), "totalHiScore", 866703499);
        setIntField(term153911, term153911.getClass(), "totalEasyHighScore", -608339436);
        setIntField(term153911, term153911.getClass(), "totalBasicHighScore", 944228739);
        setIntField(term153911, term153911.getClass(), "totalAdvancedHighScore", -601828465);
        setIntField(term153911, term153911.getClass(), "totalExpertHighScore", -1579188298);
        setIntField(term153911, term153911.getClass(), "totalMasterHighScore", 326742565);
        setIntField(term153911, term153911.getClass(), "totalReMasterHighScore", 1345047309);
        setIntField(term153911, term153911.getClass(), "totalHighSync", -817047389);
        setIntField(term153911, term153911.getClass(), "totalEasySync", 2066408978);
        setIntField(term153911, term153911.getClass(), "totalBasicSync", 449733555);
        setIntField(term153911, term153911.getClass(), "totalAdvancedSync", -1426801879);
        setIntField(term153911, term153911.getClass(), "totalExpertSync", -1607182921);
        setIntField(term153911, term153911.getClass(), "totalMasterSync", -1630128602);
        setIntField(term153911, term153911.getClass(), "totalReMasterSync", 200589671);
        setIntField(term153911, term153911.getClass(), "playerRating", 2066859768);
        setIntField(term153911, term153911.getClass(), "highestRating", -1246028132);
        setIntField(term153911, term153911.getClass(), "rankAuthTailId", 210480723);
        setField(term153911, term153911.getClass(), "eventWatchedDate", "dRGHrevrGk");
        setField(term153911, term153911.getClass(), "webLimitDate", "nUztHQImUf");
        setIntField(term153911, term153911.getClass(), "challengeTrackPhase", -1006349265);
        setIntField(term153911, term153911.getClass(), "firstPlayBits", 1087363951);
        setField(term153911, term153911.getClass(), "lastPlayDate", "ntLvGqxKQC");
        setIntField(term153911, term153911.getClass(), "lastPlaceId", -2029178149);
        setField(term153911, term153911.getClass(), "lastPlaceName", "KJiHZHSclg");
        setIntField(term153911, term153911.getClass(), "lastRegionId", -1103127972);
        setField(term153911, term153911.getClass(), "lastRegionName", "EVCYyZgkIk");
        setField(term153911, term153911.getClass(), "lastClientId", "YzWEZeucrS");
        setField(term153911, term153911.getClass(), "lastCountryCode", "dWqMWOnvZA");
        setIntField(term153911, term153911.getClass(), "eventPoint", 1172033654);
        setIntField(term153911, term153911.getClass(), "totalLv", -1179048835);
        setIntField(term153911, term153911.getClass(), "lastLoginBonusDay", -923650036);
        setIntField(term153911, term153911.getClass(), "lastSurvivalBonusDay", -1844256473);
        setIntField(term153911, term153911.getClass(), "loginBonusLv", -2086303082);
        setField(term153909, term153909.getClass(), "user", term153911);
        setIntField(term153909, term153909.getClass(), "orderId", -1563764110);
        setLongField(term153909, term153909.getClass(), "sortNumber", 3343066350756629253L);
        setIntField(term153909, term153909.getClass(), "placeId", 2100151655);
        setField(term153909, term153909.getClass(), "placeName", "LWvhNNTPry");
        setField(term153909, term153909.getClass(), "country", "NKZtzKmNMG");
        setIntField(term153909, term153909.getClass(), "regionId", 1588210372);
        setField(term153909, term153909.getClass(), "playDate", "bybEmXMboY");
        setField(term153909, term153909.getClass(), "userPlayDate", "mSHWVzcYng");
        setIntField(term153909, term153909.getClass(), "musicId", -674611574);
        setIntField(term153909, term153909.getClass(), "level", -2003828321);
        setIntField(term153909, term153909.getClass(), "gameMode", 2103465115);
        setIntField(term153909, term153909.getClass(), "rivalNum", 146989742);
        setIntField(term153909, term153909.getClass(), "track", 605822696);
        setIntField(term153909, term153909.getClass(), "eventId", 485883961);
        setBooleanField(term153909, term153909.getClass(), "isFreeToPlay", false);
        setIntField(term153909, term153909.getClass(), "playerRating", 499510238);
        setLongField(term153909, term153909.getClass(), "playedUserId1", 8321218207244044171L);
        setField(term153909, term153909.getClass(), "playedUserName1", "JbyjPaAJuH");
        setIntField(term153909, term153909.getClass(), "playedMusicLevel1", 1033869905);
        setLongField(term153909, term153909.getClass(), "playedUserId2", -5240010545022869760L);
        setField(term153909, term153909.getClass(), "playedUserName2", "YxeVJOSiti");
        setIntField(term153909, term153909.getClass(), "playedMusicLevel2", -600875251);
        setLongField(term153909, term153909.getClass(), "playedUserId3", 4229766107425466349L);
        setField(term153909, term153909.getClass(), "playedUserName3", "IuUPZzTzjB");
        setIntField(term153909, term153909.getClass(), "playedMusicLevel3", -1424347518);
        setIntField(term153909, term153909.getClass(), "achievement", 1147983173);
        setIntField(term153909, term153909.getClass(), "score", 1467584460);
        setIntField(term153909, term153909.getClass(), "tapScore", 2104798361);
        setIntField(term153909, term153909.getClass(), "holdScore", -1835154134);
        setIntField(term153909, term153909.getClass(), "slideScore", -800065707);
        setIntField(term153909, term153909.getClass(), "breakScore", -272802569);
        setIntField(term153909, term153909.getClass(), "syncRate", 670911517);
        setIntField(term153909, term153909.getClass(), "vsWin", 316657137);
        setBooleanField(term153909, term153909.getClass(), "isAllPerfect", false);
        setIntField(term153909, term153909.getClass(), "fullCombo", 1046848217);
        setIntField(term153909, term153909.getClass(), "maxFever", 179638951);
        setIntField(term153909, term153909.getClass(), "maxCombo", 622316819);
        setIntField(term153909, term153909.getClass(), "tapPerfect", -497878383);
        setIntField(term153909, term153909.getClass(), "tapGreat", 174909941);
        setIntField(term153909, term153909.getClass(), "tapGood", 1772241968);
        setIntField(term153909, term153909.getClass(), "tapBad", 1483704590);
        setIntField(term153909, term153909.getClass(), "holdPerfect", 18843099);
        setIntField(term153909, term153909.getClass(), "holdGreat", -1823419269);
        setIntField(term153909, term153909.getClass(), "holdGood", -9517269);
        setIntField(term153909, term153909.getClass(), "holdBad", 2085118514);
        setIntField(term153909, term153909.getClass(), "slidePerfect", 916423456);
        setIntField(term153909, term153909.getClass(), "slideGreat", 546964860);
        setIntField(term153909, term153909.getClass(), "slideGood", 1497574264);
        setIntField(term153909, term153909.getClass(), "slideBad", -183274267);
        setIntField(term153909, term153909.getClass(), "breakPerfect", -1455013934);
        setIntField(term153909, term153909.getClass(), "breakGreat", -1394825694);
        setIntField(term153909, term153909.getClass(), "breakGood", -474075258);
        setIntField(term153909, term153909.getClass(), "breakBad", 1127264454);
        setBooleanField(term153909, term153909.getClass(), "isTrackSkip", true);
        setBooleanField(term153909, term153909.getClass(), "isHighScore", true);
        setBooleanField(term153909, term153909.getClass(), "isChallengeTrack", false);
        setIntField(term153909, term153909.getClass(), "challengeLife", -697722007);
        setIntField(term153909, term153909.getClass(), "challengeRemain", 161065405);
        setIntField(term153909, term153909.getClass(), "isAllPerfectPlus", -1351043887);
        term154221 = new Integer(511479005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term154221;
        callMethod(klass, "setPlayedMusicLevel3", argTypes, term153909, args);
    }

};


