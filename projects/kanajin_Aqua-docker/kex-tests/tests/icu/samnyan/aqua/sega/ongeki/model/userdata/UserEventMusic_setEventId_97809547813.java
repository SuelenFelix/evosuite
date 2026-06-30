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
import java.lang.Integer;

public class UserEventMusic_setEventId_97809547813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375351;
     Object term375635;

    public UserEventMusic_setEventId_97809547813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term375357 = new Long(-4703513086610650698L);
        term375351 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term375353 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term375355 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term375371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term375372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term375376 = newInstance(Class.forName("java.time.LocalTime"));
        Object term375381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term375382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term375386 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term375351, term375351.getClass(), "id", 2672830384857873041L);
        setLongField(term375353, term375353.getClass(), "id", 751232478112531504L);
        setLongField(term375355, term375355.getClass(), "id", 6372462690993931739L);
        setField(term375355, term375355.getClass(), "extId", term375357);
        setField(term375355, term375355.getClass(), "luid", "fDtpiKvQmR");
        setIntField(term375372, term375372.getClass(), "year", 2010);
        setShortField(term375372, term375372.getClass(), "month", (short) 10);
        setShortField(term375372, term375372.getClass(), "day", (short) 6);
        setField(term375371, term375371.getClass(), "date", term375372);
        setByteField(term375376, term375376.getClass(), "hour", (byte) 14);
        setByteField(term375376, term375376.getClass(), "minute", (byte) 36);
        setByteField(term375376, term375376.getClass(), "second", (byte) 14);
        setIntField(term375376, term375376.getClass(), "nano", 964628180);
        setField(term375371, term375371.getClass(), "time", term375376);
        setField(term375355, term375355.getClass(), "registerTime", term375371);
        setIntField(term375382, term375382.getClass(), "year", 2016);
        setShortField(term375382, term375382.getClass(), "month", (short) 11);
        setShortField(term375382, term375382.getClass(), "day", (short) 14);
        setField(term375381, term375381.getClass(), "date", term375382);
        setByteField(term375386, term375386.getClass(), "hour", (byte) 10);
        setByteField(term375386, term375386.getClass(), "minute", (byte) 44);
        setByteField(term375386, term375386.getClass(), "second", (byte) 22);
        setIntField(term375386, term375386.getClass(), "nano", 303456175);
        setField(term375381, term375381.getClass(), "time", term375386);
        setField(term375355, term375355.getClass(), "accessTime", term375381);
        setField(term375353, term375353.getClass(), "card", term375355);
        setField(term375353, term375353.getClass(), "userName", "SCwWzvNwiG");
        setIntField(term375353, term375353.getClass(), "level", -603132875);
        setIntField(term375353, term375353.getClass(), "reincarnationNum", -1584571099);
        setLongField(term375353, term375353.getClass(), "exp", -7831526127260743893L);
        setLongField(term375353, term375353.getClass(), "point", 8955515826830541600L);
        setLongField(term375353, term375353.getClass(), "totalPoint", 2349196187258792824L);
        setIntField(term375353, term375353.getClass(), "playCount", -1437523027);
        setIntField(term375353, term375353.getClass(), "jewelCount", 404954067);
        setIntField(term375353, term375353.getClass(), "totalJewelCount", 385123166);
        setIntField(term375353, term375353.getClass(), "medalCount", 1136261690);
        setIntField(term375353, term375353.getClass(), "playerRating", -1764244988);
        setIntField(term375353, term375353.getClass(), "highestRating", 1404228406);
        setIntField(term375353, term375353.getClass(), "battlePoint", 1374768739);
        setIntField(term375353, term375353.getClass(), "bestBattlePoint", -770669184);
        setIntField(term375353, term375353.getClass(), "overDamageBattlePoint", 327414850);
        setBooleanField(term375353, term375353.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term375353, term375353.getClass(), "nameplateId", -1034058629);
        setIntField(term375353, term375353.getClass(), "trophyId", -85573157);
        setIntField(term375353, term375353.getClass(), "cardId", -1393002278);
        setIntField(term375353, term375353.getClass(), "characterId", 1057845056);
        setIntField(term375353, term375353.getClass(), "characterVoiceNo", -1985705986);
        setIntField(term375353, term375353.getClass(), "tabSetting", -365135725);
        setIntField(term375353, term375353.getClass(), "tabSortSetting", 2059155249);
        setIntField(term375353, term375353.getClass(), "cardCategorySetting", 1416084733);
        setIntField(term375353, term375353.getClass(), "cardSortSetting", 495781934);
        setIntField(term375353, term375353.getClass(), "rivalScoreCategorySetting", -743237692);
        setIntField(term375353, term375353.getClass(), "playedTutorialBit", 1862528665);
        setIntField(term375353, term375353.getClass(), "firstTutorialCancelNum", 846257657);
        setLongField(term375353, term375353.getClass(), "sumTechHighScore", -787156984418385966L);
        setLongField(term375353, term375353.getClass(), "sumTechBasicHighScore", -5990730739824578682L);
        setLongField(term375353, term375353.getClass(), "sumTechAdvancedHighScore", 4841563963175574377L);
        setLongField(term375353, term375353.getClass(), "sumTechExpertHighScore", 691770645640950993L);
        setLongField(term375353, term375353.getClass(), "sumTechMasterHighScore", 2196785598351440267L);
        setLongField(term375353, term375353.getClass(), "sumTechLunaticHighScore", -2817072924174452564L);
        setLongField(term375353, term375353.getClass(), "sumBattleHighScore", 398651114788467302L);
        setLongField(term375353, term375353.getClass(), "sumBattleBasicHighScore", 6460839292994852160L);
        setLongField(term375353, term375353.getClass(), "sumBattleAdvancedHighScore", 2688225555241313632L);
        setLongField(term375353, term375353.getClass(), "sumBattleExpertHighScore", -7972558245377274156L);
        setLongField(term375353, term375353.getClass(), "sumBattleMasterHighScore", -8278518450385137166L);
        setLongField(term375353, term375353.getClass(), "sumBattleLunaticHighScore", -8944138888702004914L);
        setField(term375353, term375353.getClass(), "eventWatchedDate", "ZVMfegIioj");
        setField(term375353, term375353.getClass(), "cmEventWatchedDate", "DFOIxhABne");
        setField(term375353, term375353.getClass(), "firstGameId", "aIknscMGze");
        setField(term375353, term375353.getClass(), "firstRomVersion", "ribkbLXDFH");
        setField(term375353, term375353.getClass(), "firstDataVersion", "HazapXoNId");
        setField(term375353, term375353.getClass(), "firstPlayDate", "ERhwSOTVzn");
        setField(term375353, term375353.getClass(), "lastGameId", "SrVsELySVP");
        setField(term375353, term375353.getClass(), "lastRomVersion", "kRChHgWzWK");
        setField(term375353, term375353.getClass(), "lastDataVersion", "YwWtbYwjco");
        setField(term375353, term375353.getClass(), "compatibleCmVersion", "taSDkxxipF");
        setField(term375353, term375353.getClass(), "lastPlayDate", "xzyquOPahp");
        setIntField(term375353, term375353.getClass(), "lastPlaceId", 2086414925);
        setField(term375353, term375353.getClass(), "lastPlaceName", "fEistPaGxy");
        setIntField(term375353, term375353.getClass(), "lastRegionId", 1322041992);
        setField(term375353, term375353.getClass(), "lastRegionName", "nblUmIwMZt");
        setIntField(term375353, term375353.getClass(), "lastAllNetId", 1041889458);
        setField(term375353, term375353.getClass(), "lastClientId", "jrbsNrloog");
        setIntField(term375353, term375353.getClass(), "lastUsedDeckId", -220714046);
        setIntField(term375353, term375353.getClass(), "lastPlayMusicLevel", 384204660);
        setIntField(term375353, term375353.getClass(), "lastEmoneyBrand", -941862774);
        setField(term375351, term375351.getClass(), "user", term375353);
        setIntField(term375351, term375351.getClass(), "eventId", -1318429360);
        setIntField(term375351, term375351.getClass(), "type", 1526223054);
        setIntField(term375351, term375351.getClass(), "musicId", 24576474);
        setIntField(term375351, term375351.getClass(), "level", 1285143549);
        setIntField(term375351, term375351.getClass(), "techScoreMax", -2052760738);
        setIntField(term375351, term375351.getClass(), "platinumScoreMax", 1639475595);
        setField(term375351, term375351.getClass(), "techRecordDate", "HgvnIvqOcq");
        setBooleanField(term375351, term375351.getClass(), "isTechNewRecord", true);
        term375635 = new Integer(248652373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term375635;
        callMethod(klass, "setEventId", argTypes, term375351, args);
    }

};


