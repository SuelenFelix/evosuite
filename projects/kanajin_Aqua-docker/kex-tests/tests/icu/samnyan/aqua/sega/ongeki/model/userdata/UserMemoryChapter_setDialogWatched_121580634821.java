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
import java.lang.Boolean;

public class UserMemoryChapter_setDialogWatched_121580634821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398489;
     Object term398765;

    public UserMemoryChapter_setDialogWatched_121580634821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term398495 = new Long(-4069312743655862444L);
        term398489 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term398491 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term398493 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term398509 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term398510 = newInstance(Class.forName("java.time.LocalDate"));
        Object term398514 = newInstance(Class.forName("java.time.LocalTime"));
        Object term398519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term398520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term398524 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term398489, term398489.getClass(), "id", -1424170915126137744L);
        setLongField(term398491, term398491.getClass(), "id", -7090976603783369130L);
        setLongField(term398493, term398493.getClass(), "id", 2105547361973674685L);
        setField(term398493, term398493.getClass(), "extId", term398495);
        setField(term398493, term398493.getClass(), "luid", "YkePTYCign");
        setIntField(term398510, term398510.getClass(), "year", 2015);
        setShortField(term398510, term398510.getClass(), "month", (short) 3);
        setShortField(term398510, term398510.getClass(), "day", (short) 16);
        setField(term398509, term398509.getClass(), "date", term398510);
        setByteField(term398514, term398514.getClass(), "hour", (byte) 9);
        setByteField(term398514, term398514.getClass(), "minute", (byte) 40);
        setByteField(term398514, term398514.getClass(), "second", (byte) 0);
        setIntField(term398514, term398514.getClass(), "nano", 256646409);
        setField(term398509, term398509.getClass(), "time", term398514);
        setField(term398493, term398493.getClass(), "registerTime", term398509);
        setIntField(term398520, term398520.getClass(), "year", 2017);
        setShortField(term398520, term398520.getClass(), "month", (short) 7);
        setShortField(term398520, term398520.getClass(), "day", (short) 18);
        setField(term398519, term398519.getClass(), "date", term398520);
        setByteField(term398524, term398524.getClass(), "hour", (byte) 16);
        setByteField(term398524, term398524.getClass(), "minute", (byte) 39);
        setByteField(term398524, term398524.getClass(), "second", (byte) 12);
        setIntField(term398524, term398524.getClass(), "nano", 167635063);
        setField(term398519, term398519.getClass(), "time", term398524);
        setField(term398493, term398493.getClass(), "accessTime", term398519);
        setField(term398491, term398491.getClass(), "card", term398493);
        setField(term398491, term398491.getClass(), "userName", "SnZGkCxowO");
        setIntField(term398491, term398491.getClass(), "level", -1295598943);
        setIntField(term398491, term398491.getClass(), "reincarnationNum", 2075263486);
        setLongField(term398491, term398491.getClass(), "exp", 5193414351788523845L);
        setLongField(term398491, term398491.getClass(), "point", -7203259019783668358L);
        setLongField(term398491, term398491.getClass(), "totalPoint", -5482859863685894248L);
        setIntField(term398491, term398491.getClass(), "playCount", -2100435001);
        setIntField(term398491, term398491.getClass(), "jewelCount", 1175810244);
        setIntField(term398491, term398491.getClass(), "totalJewelCount", -1658375737);
        setIntField(term398491, term398491.getClass(), "medalCount", 234943117);
        setIntField(term398491, term398491.getClass(), "playerRating", 363845055);
        setIntField(term398491, term398491.getClass(), "highestRating", -1456607186);
        setIntField(term398491, term398491.getClass(), "battlePoint", 808420148);
        setIntField(term398491, term398491.getClass(), "bestBattlePoint", -1824628035);
        setIntField(term398491, term398491.getClass(), "overDamageBattlePoint", -334733983);
        setBooleanField(term398491, term398491.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term398491, term398491.getClass(), "nameplateId", -1513519667);
        setIntField(term398491, term398491.getClass(), "trophyId", 522753718);
        setIntField(term398491, term398491.getClass(), "cardId", -925682044);
        setIntField(term398491, term398491.getClass(), "characterId", 792081523);
        setIntField(term398491, term398491.getClass(), "characterVoiceNo", -391849127);
        setIntField(term398491, term398491.getClass(), "tabSetting", 74595965);
        setIntField(term398491, term398491.getClass(), "tabSortSetting", 1910360444);
        setIntField(term398491, term398491.getClass(), "cardCategorySetting", -563748891);
        setIntField(term398491, term398491.getClass(), "cardSortSetting", -904988623);
        setIntField(term398491, term398491.getClass(), "rivalScoreCategorySetting", 735958713);
        setIntField(term398491, term398491.getClass(), "playedTutorialBit", 1315258290);
        setIntField(term398491, term398491.getClass(), "firstTutorialCancelNum", -2053007854);
        setLongField(term398491, term398491.getClass(), "sumTechHighScore", -1774467958123998772L);
        setLongField(term398491, term398491.getClass(), "sumTechBasicHighScore", -952331592427196322L);
        setLongField(term398491, term398491.getClass(), "sumTechAdvancedHighScore", 8332714523188286829L);
        setLongField(term398491, term398491.getClass(), "sumTechExpertHighScore", -7050364774011155163L);
        setLongField(term398491, term398491.getClass(), "sumTechMasterHighScore", 6051904037637991823L);
        setLongField(term398491, term398491.getClass(), "sumTechLunaticHighScore", -4929381496491547272L);
        setLongField(term398491, term398491.getClass(), "sumBattleHighScore", -4210446682323302406L);
        setLongField(term398491, term398491.getClass(), "sumBattleBasicHighScore", -9092508146526919000L);
        setLongField(term398491, term398491.getClass(), "sumBattleAdvancedHighScore", 6550193599493284471L);
        setLongField(term398491, term398491.getClass(), "sumBattleExpertHighScore", -3090971409190339633L);
        setLongField(term398491, term398491.getClass(), "sumBattleMasterHighScore", -1264000902914726799L);
        setLongField(term398491, term398491.getClass(), "sumBattleLunaticHighScore", -3351783153033446895L);
        setField(term398491, term398491.getClass(), "eventWatchedDate", "DSkkgvHyvr");
        setField(term398491, term398491.getClass(), "cmEventWatchedDate", "knylycfuKQ");
        setField(term398491, term398491.getClass(), "firstGameId", "cSlJPZNyZX");
        setField(term398491, term398491.getClass(), "firstRomVersion", "vandHCVwvw");
        setField(term398491, term398491.getClass(), "firstDataVersion", "vMZEtKpvTr");
        setField(term398491, term398491.getClass(), "firstPlayDate", "oUKpDvHFLm");
        setField(term398491, term398491.getClass(), "lastGameId", "VPaqFNIqjP");
        setField(term398491, term398491.getClass(), "lastRomVersion", "lGLYyjjKet");
        setField(term398491, term398491.getClass(), "lastDataVersion", "AACvAZdwcR");
        setField(term398491, term398491.getClass(), "compatibleCmVersion", "UFKMuyOnci");
        setField(term398491, term398491.getClass(), "lastPlayDate", "ZUoqjivIAt");
        setIntField(term398491, term398491.getClass(), "lastPlaceId", 312324168);
        setField(term398491, term398491.getClass(), "lastPlaceName", "JVmoRFpoaY");
        setIntField(term398491, term398491.getClass(), "lastRegionId", 1344322433);
        setField(term398491, term398491.getClass(), "lastRegionName", "jeWorKqmlz");
        setIntField(term398491, term398491.getClass(), "lastAllNetId", 19959741);
        setField(term398491, term398491.getClass(), "lastClientId", "DKhWYAOfsT");
        setIntField(term398491, term398491.getClass(), "lastUsedDeckId", -271941306);
        setIntField(term398491, term398491.getClass(), "lastPlayMusicLevel", 2118487645);
        setIntField(term398491, term398491.getClass(), "lastEmoneyBrand", -396510986);
        setField(term398489, term398489.getClass(), "user", term398491);
        setIntField(term398489, term398489.getClass(), "chapterId", 658217490);
        setIntField(term398489, term398489.getClass(), "jewelCount", -1344461184);
        setIntField(term398489, term398489.getClass(), "lastPlayMusicCategory", -1110856338);
        setIntField(term398489, term398489.getClass(), "lastPlayMusicId", 1360189864);
        setIntField(term398489, term398489.getClass(), "lastPlayMusicLevel", 1754653079);
        setBooleanField(term398489, term398489.getClass(), "isDialogWatched", true);
        setBooleanField(term398489, term398489.getClass(), "isStoryWatched", true);
        setBooleanField(term398489, term398489.getClass(), "isBossWatched", false);
        setBooleanField(term398489, term398489.getClass(), "isClear", false);
        setIntField(term398489, term398489.getClass(), "gaugeId", -368380808);
        setIntField(term398489, term398489.getClass(), "gaugeNum", 1556821358);
        term398765 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term398765;
        callMethod(klass, "setDialogWatched", argTypes, term398489, args);
    }

};


