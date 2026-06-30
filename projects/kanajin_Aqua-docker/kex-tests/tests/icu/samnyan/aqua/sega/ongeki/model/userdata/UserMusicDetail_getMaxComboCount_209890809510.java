package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMusicDetail_getMaxComboCount_209890809510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408140;

    public UserMusicDetail_getMaxComboCount_209890809510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term408146 = new Long(-3323049156110984575L);
        term408140 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term408142 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term408144 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term408160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term408161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term408165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term408170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term408171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term408175 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term408140, term408140.getClass(), "id", 8069460781470355666L);
        setLongField(term408142, term408142.getClass(), "id", -4781712160480416181L);
        setLongField(term408144, term408144.getClass(), "id", -3409203382397558369L);
        setField(term408144, term408144.getClass(), "extId", term408146);
        setField(term408144, term408144.getClass(), "luid", "HMlIGUocSE");
        setIntField(term408161, term408161.getClass(), "year", 2028);
        setShortField(term408161, term408161.getClass(), "month", (short) 1);
        setShortField(term408161, term408161.getClass(), "day", (short) 22);
        setField(term408160, term408160.getClass(), "date", term408161);
        setByteField(term408165, term408165.getClass(), "hour", (byte) 18);
        setByteField(term408165, term408165.getClass(), "minute", (byte) 19);
        setByteField(term408165, term408165.getClass(), "second", (byte) 33);
        setIntField(term408165, term408165.getClass(), "nano", 811633343);
        setField(term408160, term408160.getClass(), "time", term408165);
        setField(term408144, term408144.getClass(), "registerTime", term408160);
        setIntField(term408171, term408171.getClass(), "year", 2013);
        setShortField(term408171, term408171.getClass(), "month", (short) 4);
        setShortField(term408171, term408171.getClass(), "day", (short) 8);
        setField(term408170, term408170.getClass(), "date", term408171);
        setByteField(term408175, term408175.getClass(), "hour", (byte) 11);
        setByteField(term408175, term408175.getClass(), "minute", (byte) 55);
        setByteField(term408175, term408175.getClass(), "second", (byte) 47);
        setIntField(term408175, term408175.getClass(), "nano", 633671681);
        setField(term408170, term408170.getClass(), "time", term408175);
        setField(term408144, term408144.getClass(), "accessTime", term408170);
        setField(term408142, term408142.getClass(), "card", term408144);
        setField(term408142, term408142.getClass(), "userName", "ndRBfkjbGM");
        setIntField(term408142, term408142.getClass(), "level", -1727212419);
        setIntField(term408142, term408142.getClass(), "reincarnationNum", 1788578552);
        setLongField(term408142, term408142.getClass(), "exp", -706932922347507004L);
        setLongField(term408142, term408142.getClass(), "point", -1764385305518281595L);
        setLongField(term408142, term408142.getClass(), "totalPoint", 724528748480602014L);
        setIntField(term408142, term408142.getClass(), "playCount", -1329910369);
        setIntField(term408142, term408142.getClass(), "jewelCount", -75621713);
        setIntField(term408142, term408142.getClass(), "totalJewelCount", -1875105428);
        setIntField(term408142, term408142.getClass(), "medalCount", -1639358529);
        setIntField(term408142, term408142.getClass(), "playerRating", -1549710331);
        setIntField(term408142, term408142.getClass(), "highestRating", -1628085500);
        setIntField(term408142, term408142.getClass(), "battlePoint", 1268527865);
        setIntField(term408142, term408142.getClass(), "bestBattlePoint", 1672470757);
        setIntField(term408142, term408142.getClass(), "overDamageBattlePoint", 1336072683);
        setBooleanField(term408142, term408142.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term408142, term408142.getClass(), "nameplateId", 2087057355);
        setIntField(term408142, term408142.getClass(), "trophyId", -1213597935);
        setIntField(term408142, term408142.getClass(), "cardId", 1137295659);
        setIntField(term408142, term408142.getClass(), "characterId", -113371480);
        setIntField(term408142, term408142.getClass(), "characterVoiceNo", -1481366677);
        setIntField(term408142, term408142.getClass(), "tabSetting", 1187923863);
        setIntField(term408142, term408142.getClass(), "tabSortSetting", -604826271);
        setIntField(term408142, term408142.getClass(), "cardCategorySetting", -1932039978);
        setIntField(term408142, term408142.getClass(), "cardSortSetting", -94232504);
        setIntField(term408142, term408142.getClass(), "rivalScoreCategorySetting", -1319582125);
        setIntField(term408142, term408142.getClass(), "playedTutorialBit", 1581726545);
        setIntField(term408142, term408142.getClass(), "firstTutorialCancelNum", 911574377);
        setLongField(term408142, term408142.getClass(), "sumTechHighScore", -264339565166876549L);
        setLongField(term408142, term408142.getClass(), "sumTechBasicHighScore", 5501480431698388561L);
        setLongField(term408142, term408142.getClass(), "sumTechAdvancedHighScore", -2640962884574063003L);
        setLongField(term408142, term408142.getClass(), "sumTechExpertHighScore", 6104247605242922173L);
        setLongField(term408142, term408142.getClass(), "sumTechMasterHighScore", 4660674450759289749L);
        setLongField(term408142, term408142.getClass(), "sumTechLunaticHighScore", -8321604432925049526L);
        setLongField(term408142, term408142.getClass(), "sumBattleHighScore", 567012735639740565L);
        setLongField(term408142, term408142.getClass(), "sumBattleBasicHighScore", -3855917769840841392L);
        setLongField(term408142, term408142.getClass(), "sumBattleAdvancedHighScore", -6748352254616500189L);
        setLongField(term408142, term408142.getClass(), "sumBattleExpertHighScore", -5293032168048712263L);
        setLongField(term408142, term408142.getClass(), "sumBattleMasterHighScore", 6550457563175408252L);
        setLongField(term408142, term408142.getClass(), "sumBattleLunaticHighScore", 7939212619192592869L);
        setField(term408142, term408142.getClass(), "eventWatchedDate", "RrwIQAiePk");
        setField(term408142, term408142.getClass(), "cmEventWatchedDate", "HDzQJcHlka");
        setField(term408142, term408142.getClass(), "firstGameId", "JzoEFoABnK");
        setField(term408142, term408142.getClass(), "firstRomVersion", "AZrDHgNWOi");
        setField(term408142, term408142.getClass(), "firstDataVersion", "LuunBTdvQF");
        setField(term408142, term408142.getClass(), "firstPlayDate", "oCDZkmOLrl");
        setField(term408142, term408142.getClass(), "lastGameId", "wKKvAkmJcO");
        setField(term408142, term408142.getClass(), "lastRomVersion", "PsPAZtuJqY");
        setField(term408142, term408142.getClass(), "lastDataVersion", "mNeSoMnjtw");
        setField(term408142, term408142.getClass(), "compatibleCmVersion", "QOhrINoLvT");
        setField(term408142, term408142.getClass(), "lastPlayDate", "VcuKLERpQa");
        setIntField(term408142, term408142.getClass(), "lastPlaceId", 1251521608);
        setField(term408142, term408142.getClass(), "lastPlaceName", "yMJkYoIaKk");
        setIntField(term408142, term408142.getClass(), "lastRegionId", -174934999);
        setField(term408142, term408142.getClass(), "lastRegionName", "mYqyuubDqX");
        setIntField(term408142, term408142.getClass(), "lastAllNetId", -1682191652);
        setField(term408142, term408142.getClass(), "lastClientId", "rauEuWyywj");
        setIntField(term408142, term408142.getClass(), "lastUsedDeckId", 1752200194);
        setIntField(term408142, term408142.getClass(), "lastPlayMusicLevel", 1528791186);
        setIntField(term408142, term408142.getClass(), "lastEmoneyBrand", 483590029);
        setField(term408140, term408140.getClass(), "user", term408142);
        setIntField(term408140, term408140.getClass(), "musicId", -577309341);
        setIntField(term408140, term408140.getClass(), "level", 1979450501);
        setIntField(term408140, term408140.getClass(), "playCount", -1037825640);
        setIntField(term408140, term408140.getClass(), "techScoreMax", 723535414);
        setIntField(term408140, term408140.getClass(), "techScoreRank", 618788712);
        setIntField(term408140, term408140.getClass(), "battleScoreMax", 1659603432);
        setIntField(term408140, term408140.getClass(), "battleScoreRank", 1427815255);
        setIntField(term408140, term408140.getClass(), "maxComboCount", 512015889);
        setIntField(term408140, term408140.getClass(), "maxOverKill", -1654751116);
        setIntField(term408140, term408140.getClass(), "maxTeamOverKill", -799674802);
        setBooleanField(term408140, term408140.getClass(), "isFullBell", true);
        setBooleanField(term408140, term408140.getClass(), "isFullCombo", false);
        setBooleanField(term408140, term408140.getClass(), "isAllBreake", true);
        setBooleanField(term408140, term408140.getClass(), "isLock", false);
        setIntField(term408140, term408140.getClass(), "clearStatus", 720727517);
        setBooleanField(term408140, term408140.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxComboCount", argTypes, term408140, args);
    }

};


