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

public class UserCard_setCardId_62125764320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122380;
     Object term122725;

    public UserCard_setCardId_62125764320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term122386 = new Long(8000844860910174690L);
        term122380 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term122382 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term122384 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term122400 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122401 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122405 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122415 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term122380, term122380.getClass(), "id", 8412486208505279309L);
        setLongField(term122382, term122382.getClass(), "id", -5251357731935203502L);
        setLongField(term122384, term122384.getClass(), "id", 3736283980701877186L);
        setField(term122384, term122384.getClass(), "extId", term122386);
        setField(term122384, term122384.getClass(), "luid", "LIheLKvBPl");
        setIntField(term122401, term122401.getClass(), "year", 2028);
        setShortField(term122401, term122401.getClass(), "month", (short) 4);
        setShortField(term122401, term122401.getClass(), "day", (short) 9);
        setField(term122400, term122400.getClass(), "date", term122401);
        setByteField(term122405, term122405.getClass(), "hour", (byte) 16);
        setByteField(term122405, term122405.getClass(), "minute", (byte) 26);
        setByteField(term122405, term122405.getClass(), "second", (byte) 35);
        setIntField(term122405, term122405.getClass(), "nano", 546233932);
        setField(term122400, term122400.getClass(), "time", term122405);
        setField(term122384, term122384.getClass(), "registerTime", term122400);
        setIntField(term122411, term122411.getClass(), "year", 2022);
        setShortField(term122411, term122411.getClass(), "month", (short) 3);
        setShortField(term122411, term122411.getClass(), "day", (short) 19);
        setField(term122410, term122410.getClass(), "date", term122411);
        setByteField(term122415, term122415.getClass(), "hour", (byte) 6);
        setByteField(term122415, term122415.getClass(), "minute", (byte) 55);
        setByteField(term122415, term122415.getClass(), "second", (byte) 49);
        setIntField(term122415, term122415.getClass(), "nano", 478088059);
        setField(term122410, term122410.getClass(), "time", term122415);
        setField(term122384, term122384.getClass(), "accessTime", term122410);
        setField(term122382, term122382.getClass(), "card", term122384);
        setField(term122382, term122382.getClass(), "userName", "skbwTMoBkR");
        setIntField(term122382, term122382.getClass(), "level", 86490701);
        setIntField(term122382, term122382.getClass(), "reincarnationNum", -406097429);
        setLongField(term122382, term122382.getClass(), "exp", 1223577998790065069L);
        setLongField(term122382, term122382.getClass(), "point", -6045087572534678483L);
        setLongField(term122382, term122382.getClass(), "totalPoint", -5928264122876451158L);
        setIntField(term122382, term122382.getClass(), "playCount", 473643844);
        setIntField(term122382, term122382.getClass(), "jewelCount", 1336551685);
        setIntField(term122382, term122382.getClass(), "totalJewelCount", -171146643);
        setIntField(term122382, term122382.getClass(), "medalCount", 1243420669);
        setIntField(term122382, term122382.getClass(), "playerRating", 1961265905);
        setIntField(term122382, term122382.getClass(), "highestRating", -194331877);
        setIntField(term122382, term122382.getClass(), "battlePoint", -948751278);
        setIntField(term122382, term122382.getClass(), "bestBattlePoint", -403239789);
        setIntField(term122382, term122382.getClass(), "overDamageBattlePoint", 1919856422);
        setBooleanField(term122382, term122382.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term122382, term122382.getClass(), "nameplateId", 1075667277);
        setIntField(term122382, term122382.getClass(), "trophyId", 523284856);
        setIntField(term122382, term122382.getClass(), "cardId", -1189621083);
        setIntField(term122382, term122382.getClass(), "characterId", -1476735618);
        setIntField(term122382, term122382.getClass(), "characterVoiceNo", -1126757723);
        setIntField(term122382, term122382.getClass(), "tabSetting", -1650915963);
        setIntField(term122382, term122382.getClass(), "tabSortSetting", 1043027844);
        setIntField(term122382, term122382.getClass(), "cardCategorySetting", 893498941);
        setIntField(term122382, term122382.getClass(), "cardSortSetting", -1645433738);
        setIntField(term122382, term122382.getClass(), "rivalScoreCategorySetting", 170899666);
        setIntField(term122382, term122382.getClass(), "playedTutorialBit", -1076430581);
        setIntField(term122382, term122382.getClass(), "firstTutorialCancelNum", 1009467504);
        setLongField(term122382, term122382.getClass(), "sumTechHighScore", 4756385830485408859L);
        setLongField(term122382, term122382.getClass(), "sumTechBasicHighScore", -3950460049239125314L);
        setLongField(term122382, term122382.getClass(), "sumTechAdvancedHighScore", 8508777815516345581L);
        setLongField(term122382, term122382.getClass(), "sumTechExpertHighScore", 4480527095346631658L);
        setLongField(term122382, term122382.getClass(), "sumTechMasterHighScore", -1445651963846059939L);
        setLongField(term122382, term122382.getClass(), "sumTechLunaticHighScore", -3260791775172267423L);
        setLongField(term122382, term122382.getClass(), "sumBattleHighScore", -4716553451942082494L);
        setLongField(term122382, term122382.getClass(), "sumBattleBasicHighScore", -5284180216648117395L);
        setLongField(term122382, term122382.getClass(), "sumBattleAdvancedHighScore", -8953515687010684205L);
        setLongField(term122382, term122382.getClass(), "sumBattleExpertHighScore", 7677810816137038994L);
        setLongField(term122382, term122382.getClass(), "sumBattleMasterHighScore", -8965065206212832087L);
        setLongField(term122382, term122382.getClass(), "sumBattleLunaticHighScore", 4809452600034493683L);
        setField(term122382, term122382.getClass(), "eventWatchedDate", "nyZemBzxeX");
        setField(term122382, term122382.getClass(), "cmEventWatchedDate", "mYUsMDfwJF");
        setField(term122382, term122382.getClass(), "firstGameId", "IYNumeLuJm");
        setField(term122382, term122382.getClass(), "firstRomVersion", "baWqGUwddd");
        setField(term122382, term122382.getClass(), "firstDataVersion", "ytUYpWefdA");
        setField(term122382, term122382.getClass(), "firstPlayDate", "fdBtFIcFIQ");
        setField(term122382, term122382.getClass(), "lastGameId", "XixxNbivtN");
        setField(term122382, term122382.getClass(), "lastRomVersion", "wOXNBqWiix");
        setField(term122382, term122382.getClass(), "lastDataVersion", "inGpCNlqqu");
        setField(term122382, term122382.getClass(), "compatibleCmVersion", "PzAzTtIUoU");
        setField(term122382, term122382.getClass(), "lastPlayDate", "pltGCOzvHY");
        setIntField(term122382, term122382.getClass(), "lastPlaceId", -140520015);
        setField(term122382, term122382.getClass(), "lastPlaceName", "snpbZcNTTs");
        setIntField(term122382, term122382.getClass(), "lastRegionId", -1112538327);
        setField(term122382, term122382.getClass(), "lastRegionName", "SXATqDKVMx");
        setIntField(term122382, term122382.getClass(), "lastAllNetId", 834878229);
        setField(term122382, term122382.getClass(), "lastClientId", "WmLDnzSUcH");
        setIntField(term122382, term122382.getClass(), "lastUsedDeckId", 602457171);
        setIntField(term122382, term122382.getClass(), "lastPlayMusicLevel", -625958026);
        setIntField(term122382, term122382.getClass(), "lastEmoneyBrand", 1365173968);
        setField(term122380, term122380.getClass(), "user", term122382);
        setIntField(term122380, term122380.getClass(), "cardId", -1);
        setIntField(term122380, term122380.getClass(), "digitalStock", 1);
        setIntField(term122380, term122380.getClass(), "analogStock", -58269650);
        setIntField(term122380, term122380.getClass(), "level", -1473226766);
        setIntField(term122380, term122380.getClass(), "maxLevel", 10);
        setIntField(term122380, term122380.getClass(), "exp", 675408622);
        setIntField(term122380, term122380.getClass(), "printCount", 1010137030);
        setIntField(term122380, term122380.getClass(), "useCount", -1889642100);
        setBooleanField(term122380, term122380.getClass(), "isNew", true);
        setField(term122380, term122380.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term122380, term122380.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term122380, term122380.getClass(), "skillId", 2145169938);
        setBooleanField(term122380, term122380.getClass(), "isAcquired", true);
        setField(term122380, term122380.getClass(), "created", "0000-00-00 00:00:00.0");
        term122725 = new Integer(200649815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term122725;
        callMethod(klass, "setCardId", argTypes, term122380, args);
    }

};


