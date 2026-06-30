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

public class UserOption_getVolGuide_128089107011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313533;

    public UserOption_getVolGuide_128089107011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term313539 = new Long(-4370635295110591519L);
        term313533 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term313535 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term313537 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term313553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313558 = newInstance(Class.forName("java.time.LocalTime"));
        Object term313563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term313564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term313568 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term313533, term313533.getClass(), "id", -7170417449554679161L);
        setLongField(term313535, term313535.getClass(), "id", 8919856003363102972L);
        setLongField(term313537, term313537.getClass(), "id", -3848956618338893985L);
        setField(term313537, term313537.getClass(), "extId", term313539);
        setField(term313537, term313537.getClass(), "luid", "FYpENSbXJU");
        setIntField(term313554, term313554.getClass(), "year", 2012);
        setShortField(term313554, term313554.getClass(), "month", (short) 11);
        setShortField(term313554, term313554.getClass(), "day", (short) 28);
        setField(term313553, term313553.getClass(), "date", term313554);
        setByteField(term313558, term313558.getClass(), "hour", (byte) 19);
        setByteField(term313558, term313558.getClass(), "minute", (byte) 18);
        setByteField(term313558, term313558.getClass(), "second", (byte) 3);
        setIntField(term313558, term313558.getClass(), "nano", 323457154);
        setField(term313553, term313553.getClass(), "time", term313558);
        setField(term313537, term313537.getClass(), "registerTime", term313553);
        setIntField(term313564, term313564.getClass(), "year", 2020);
        setShortField(term313564, term313564.getClass(), "month", (short) 9);
        setShortField(term313564, term313564.getClass(), "day", (short) 1);
        setField(term313563, term313563.getClass(), "date", term313564);
        setByteField(term313568, term313568.getClass(), "hour", (byte) 22);
        setByteField(term313568, term313568.getClass(), "minute", (byte) 39);
        setByteField(term313568, term313568.getClass(), "second", (byte) 14);
        setIntField(term313568, term313568.getClass(), "nano", 306720874);
        setField(term313563, term313563.getClass(), "time", term313568);
        setField(term313537, term313537.getClass(), "accessTime", term313563);
        setField(term313535, term313535.getClass(), "card", term313537);
        setField(term313535, term313535.getClass(), "userName", "lIbSpSPDyK");
        setIntField(term313535, term313535.getClass(), "level", -1474787582);
        setIntField(term313535, term313535.getClass(), "reincarnationNum", 578870419);
        setLongField(term313535, term313535.getClass(), "exp", -8568997213789951750L);
        setLongField(term313535, term313535.getClass(), "point", -3538699036958497100L);
        setLongField(term313535, term313535.getClass(), "totalPoint", -6483807793659032627L);
        setIntField(term313535, term313535.getClass(), "playCount", -1234755274);
        setIntField(term313535, term313535.getClass(), "jewelCount", -1731737733);
        setIntField(term313535, term313535.getClass(), "totalJewelCount", 524549049);
        setIntField(term313535, term313535.getClass(), "medalCount", 1236106946);
        setIntField(term313535, term313535.getClass(), "playerRating", -1057895738);
        setIntField(term313535, term313535.getClass(), "highestRating", -93626992);
        setIntField(term313535, term313535.getClass(), "battlePoint", -1568804083);
        setIntField(term313535, term313535.getClass(), "bestBattlePoint", -1553544579);
        setIntField(term313535, term313535.getClass(), "overDamageBattlePoint", 214455591);
        setBooleanField(term313535, term313535.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term313535, term313535.getClass(), "nameplateId", 489539161);
        setIntField(term313535, term313535.getClass(), "trophyId", 1515470608);
        setIntField(term313535, term313535.getClass(), "cardId", -1143133939);
        setIntField(term313535, term313535.getClass(), "characterId", 1626744743);
        setIntField(term313535, term313535.getClass(), "characterVoiceNo", 1426887693);
        setIntField(term313535, term313535.getClass(), "tabSetting", 2144652175);
        setIntField(term313535, term313535.getClass(), "tabSortSetting", -1761004554);
        setIntField(term313535, term313535.getClass(), "cardCategorySetting", -1723168799);
        setIntField(term313535, term313535.getClass(), "cardSortSetting", -203724985);
        setIntField(term313535, term313535.getClass(), "rivalScoreCategorySetting", 621459082);
        setIntField(term313535, term313535.getClass(), "playedTutorialBit", -1797826981);
        setIntField(term313535, term313535.getClass(), "firstTutorialCancelNum", -2145638062);
        setLongField(term313535, term313535.getClass(), "sumTechHighScore", 1871387369115955173L);
        setLongField(term313535, term313535.getClass(), "sumTechBasicHighScore", 7202011591168556535L);
        setLongField(term313535, term313535.getClass(), "sumTechAdvancedHighScore", 51605906118919204L);
        setLongField(term313535, term313535.getClass(), "sumTechExpertHighScore", -2158381598907689335L);
        setLongField(term313535, term313535.getClass(), "sumTechMasterHighScore", -6738465408124598406L);
        setLongField(term313535, term313535.getClass(), "sumTechLunaticHighScore", -7123561028367105592L);
        setLongField(term313535, term313535.getClass(), "sumBattleHighScore", 7082971879206651405L);
        setLongField(term313535, term313535.getClass(), "sumBattleBasicHighScore", 1522383382888266253L);
        setLongField(term313535, term313535.getClass(), "sumBattleAdvancedHighScore", -4262667643897384539L);
        setLongField(term313535, term313535.getClass(), "sumBattleExpertHighScore", 8805823025107299052L);
        setLongField(term313535, term313535.getClass(), "sumBattleMasterHighScore", -3114570385515842708L);
        setLongField(term313535, term313535.getClass(), "sumBattleLunaticHighScore", 481559254026560152L);
        setField(term313535, term313535.getClass(), "eventWatchedDate", "XhiuPGVKrE");
        setField(term313535, term313535.getClass(), "cmEventWatchedDate", "SGOwXdQQSY");
        setField(term313535, term313535.getClass(), "firstGameId", "dHXclHCaUP");
        setField(term313535, term313535.getClass(), "firstRomVersion", "NNQTRipcCv");
        setField(term313535, term313535.getClass(), "firstDataVersion", "dZhWZfUVgS");
        setField(term313535, term313535.getClass(), "firstPlayDate", "qMvhAPFRIy");
        setField(term313535, term313535.getClass(), "lastGameId", "mbszMHbKhk");
        setField(term313535, term313535.getClass(), "lastRomVersion", "tJAUsTSKkk");
        setField(term313535, term313535.getClass(), "lastDataVersion", "VEHiNYtljb");
        setField(term313535, term313535.getClass(), "compatibleCmVersion", "suoEAqekUb");
        setField(term313535, term313535.getClass(), "lastPlayDate", "qmZEKiXqxP");
        setIntField(term313535, term313535.getClass(), "lastPlaceId", 1761020170);
        setField(term313535, term313535.getClass(), "lastPlaceName", "lAuVFraTOT");
        setIntField(term313535, term313535.getClass(), "lastRegionId", 290454495);
        setField(term313535, term313535.getClass(), "lastRegionName", "LyyBpbZJne");
        setIntField(term313535, term313535.getClass(), "lastAllNetId", 35758240);
        setField(term313535, term313535.getClass(), "lastClientId", "olEGCxILaf");
        setIntField(term313535, term313535.getClass(), "lastUsedDeckId", 1342022187);
        setIntField(term313535, term313535.getClass(), "lastPlayMusicLevel", 662806790);
        setIntField(term313535, term313535.getClass(), "lastEmoneyBrand", -530470841);
        setField(term313533, term313533.getClass(), "user", term313535);
        setIntField(term313533, term313533.getClass(), "optionSet", 184595024);
        setIntField(term313533, term313533.getClass(), "speed", -394012312);
        setIntField(term313533, term313533.getClass(), "mirror", 943033369);
        setIntField(term313533, term313533.getClass(), "judgeTiming", -1081096314);
        setIntField(term313533, term313533.getClass(), "judgeAdjustment", 136764993);
        setIntField(term313533, term313533.getClass(), "abort", 700236321);
        setIntField(term313533, term313533.getClass(), "stealthField", 1622185751);
        setIntField(term313533, term313533.getClass(), "tapSound", -465468962);
        setIntField(term313533, term313533.getClass(), "volGuide", 1720118518);
        setIntField(term313533, term313533.getClass(), "volAll", 1426454559);
        setIntField(term313533, term313533.getClass(), "volTap", -537812530);
        setIntField(term313533, term313533.getClass(), "volCrTap", 1838750916);
        setIntField(term313533, term313533.getClass(), "volHold", -793108156);
        setIntField(term313533, term313533.getClass(), "volSide", -724037199);
        setIntField(term313533, term313533.getClass(), "volFlick", 1927212612);
        setIntField(term313533, term313533.getClass(), "volBell", 126538454);
        setIntField(term313533, term313533.getClass(), "volEnemy", -760257737);
        setIntField(term313533, term313533.getClass(), "volSkill", -1860912448);
        setIntField(term313533, term313533.getClass(), "volDamage", -1270112190);
        setIntField(term313533, term313533.getClass(), "colorField", -1015761141);
        setIntField(term313533, term313533.getClass(), "colorLaneBright", 342340917);
        setIntField(term313533, term313533.getClass(), "colorWallBright", 2008214817);
        setIntField(term313533, term313533.getClass(), "colorLane", -833146603);
        setIntField(term313533, term313533.getClass(), "colorSide", 276109099);
        setIntField(term313533, term313533.getClass(), "effectDamage", 237131620);
        setIntField(term313533, term313533.getClass(), "effectPos", 864410154);
        setIntField(term313533, term313533.getClass(), "judgeDisp", -1352017005);
        setIntField(term313533, term313533.getClass(), "judgePos", 530583938);
        setIntField(term313533, term313533.getClass(), "judgeBreak", -241353399);
        setIntField(term313533, term313533.getClass(), "judgeHit", 294672775);
        setIntField(term313533, term313533.getClass(), "platinumBreakDisp", -1480768420);
        setIntField(term313533, term313533.getClass(), "judgeCriticalBreak", -720612912);
        setIntField(term313533, term313533.getClass(), "matching", -2026587727);
        setIntField(term313533, term313533.getClass(), "dispPlayerLv", -903876274);
        setIntField(term313533, term313533.getClass(), "dispRating", 496034401);
        setIntField(term313533, term313533.getClass(), "dispBP", 1773808003);
        setIntField(term313533, term313533.getClass(), "headphone", 620201172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolGuide", argTypes, term313533, args);
    }

};


