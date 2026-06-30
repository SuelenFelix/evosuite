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

public class UserLoginBonus_getUser_9686186122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301681;

    public UserLoginBonus_getUser_9686186122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term301687 = new Long(5160033404788124731L);
        term301681 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term301683 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term301685 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term301701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term301702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term301706 = newInstance(Class.forName("java.time.LocalTime"));
        Object term301711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term301712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term301716 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term301681, term301681.getClass(), "id", 9030193904526324699L);
        setLongField(term301683, term301683.getClass(), "id", -2508094773588113310L);
        setLongField(term301685, term301685.getClass(), "id", 7022394372029953394L);
        setField(term301685, term301685.getClass(), "extId", term301687);
        setField(term301685, term301685.getClass(), "luid", "iQgpBjoGXJ");
        setIntField(term301702, term301702.getClass(), "year", 2024);
        setShortField(term301702, term301702.getClass(), "month", (short) 12);
        setShortField(term301702, term301702.getClass(), "day", (short) 14);
        setField(term301701, term301701.getClass(), "date", term301702);
        setByteField(term301706, term301706.getClass(), "hour", (byte) 20);
        setByteField(term301706, term301706.getClass(), "minute", (byte) 50);
        setByteField(term301706, term301706.getClass(), "second", (byte) 27);
        setIntField(term301706, term301706.getClass(), "nano", 175500624);
        setField(term301701, term301701.getClass(), "time", term301706);
        setField(term301685, term301685.getClass(), "registerTime", term301701);
        setIntField(term301712, term301712.getClass(), "year", 2029);
        setShortField(term301712, term301712.getClass(), "month", (short) 1);
        setShortField(term301712, term301712.getClass(), "day", (short) 21);
        setField(term301711, term301711.getClass(), "date", term301712);
        setByteField(term301716, term301716.getClass(), "hour", (byte) 11);
        setByteField(term301716, term301716.getClass(), "minute", (byte) 23);
        setByteField(term301716, term301716.getClass(), "second", (byte) 16);
        setIntField(term301716, term301716.getClass(), "nano", 625865316);
        setField(term301711, term301711.getClass(), "time", term301716);
        setField(term301685, term301685.getClass(), "accessTime", term301711);
        setField(term301683, term301683.getClass(), "card", term301685);
        setField(term301683, term301683.getClass(), "userName", "mWztTjhUcj");
        setIntField(term301683, term301683.getClass(), "level", 46700178);
        setIntField(term301683, term301683.getClass(), "reincarnationNum", 1942396463);
        setLongField(term301683, term301683.getClass(), "exp", 4346818279485952150L);
        setLongField(term301683, term301683.getClass(), "point", 814957458332144457L);
        setLongField(term301683, term301683.getClass(), "totalPoint", 435243871105585338L);
        setIntField(term301683, term301683.getClass(), "playCount", -1276675091);
        setIntField(term301683, term301683.getClass(), "jewelCount", -1101035418);
        setIntField(term301683, term301683.getClass(), "totalJewelCount", -452240687);
        setIntField(term301683, term301683.getClass(), "medalCount", 1558172934);
        setIntField(term301683, term301683.getClass(), "playerRating", 1298839615);
        setIntField(term301683, term301683.getClass(), "highestRating", -1918351989);
        setIntField(term301683, term301683.getClass(), "battlePoint", 1272701520);
        setIntField(term301683, term301683.getClass(), "bestBattlePoint", -1398992109);
        setIntField(term301683, term301683.getClass(), "overDamageBattlePoint", -409399250);
        setBooleanField(term301683, term301683.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term301683, term301683.getClass(), "nameplateId", 1107569375);
        setIntField(term301683, term301683.getClass(), "trophyId", -725804226);
        setIntField(term301683, term301683.getClass(), "cardId", -1427802140);
        setIntField(term301683, term301683.getClass(), "characterId", -1873578907);
        setIntField(term301683, term301683.getClass(), "characterVoiceNo", -1113311132);
        setIntField(term301683, term301683.getClass(), "tabSetting", -301733567);
        setIntField(term301683, term301683.getClass(), "tabSortSetting", -589850841);
        setIntField(term301683, term301683.getClass(), "cardCategorySetting", 2108113098);
        setIntField(term301683, term301683.getClass(), "cardSortSetting", 1645826517);
        setIntField(term301683, term301683.getClass(), "rivalScoreCategorySetting", 463829962);
        setIntField(term301683, term301683.getClass(), "playedTutorialBit", 530821744);
        setIntField(term301683, term301683.getClass(), "firstTutorialCancelNum", -984683276);
        setLongField(term301683, term301683.getClass(), "sumTechHighScore", 4816757389876944091L);
        setLongField(term301683, term301683.getClass(), "sumTechBasicHighScore", -5126219848163944526L);
        setLongField(term301683, term301683.getClass(), "sumTechAdvancedHighScore", 1754859959551577604L);
        setLongField(term301683, term301683.getClass(), "sumTechExpertHighScore", 4854407137210001616L);
        setLongField(term301683, term301683.getClass(), "sumTechMasterHighScore", -6415008042148378832L);
        setLongField(term301683, term301683.getClass(), "sumTechLunaticHighScore", 8072329820638931614L);
        setLongField(term301683, term301683.getClass(), "sumBattleHighScore", 2670571080316199860L);
        setLongField(term301683, term301683.getClass(), "sumBattleBasicHighScore", 6216002294799728090L);
        setLongField(term301683, term301683.getClass(), "sumBattleAdvancedHighScore", -7921185888239414661L);
        setLongField(term301683, term301683.getClass(), "sumBattleExpertHighScore", -2523172206615691071L);
        setLongField(term301683, term301683.getClass(), "sumBattleMasterHighScore", 8101646302671312101L);
        setLongField(term301683, term301683.getClass(), "sumBattleLunaticHighScore", -4412473032602566000L);
        setField(term301683, term301683.getClass(), "eventWatchedDate", "nBCsrSCNym");
        setField(term301683, term301683.getClass(), "cmEventWatchedDate", "yWwxzvskUK");
        setField(term301683, term301683.getClass(), "firstGameId", "DpghyDxPRQ");
        setField(term301683, term301683.getClass(), "firstRomVersion", "dejAqujyZr");
        setField(term301683, term301683.getClass(), "firstDataVersion", "YOOpOJUVhi");
        setField(term301683, term301683.getClass(), "firstPlayDate", "BzYCBybylB");
        setField(term301683, term301683.getClass(), "lastGameId", "KGmEuVckVx");
        setField(term301683, term301683.getClass(), "lastRomVersion", "JIqJWTPJSn");
        setField(term301683, term301683.getClass(), "lastDataVersion", "gnxtJXVkUK");
        setField(term301683, term301683.getClass(), "compatibleCmVersion", "lposbQqAUU");
        setField(term301683, term301683.getClass(), "lastPlayDate", "CZZYeaxqjs");
        setIntField(term301683, term301683.getClass(), "lastPlaceId", 328701966);
        setField(term301683, term301683.getClass(), "lastPlaceName", "KaNkKUHQsw");
        setIntField(term301683, term301683.getClass(), "lastRegionId", -43764304);
        setField(term301683, term301683.getClass(), "lastRegionName", "LCbzYYPHVk");
        setIntField(term301683, term301683.getClass(), "lastAllNetId", 1982417722);
        setField(term301683, term301683.getClass(), "lastClientId", "KbJoSNqLbc");
        setIntField(term301683, term301683.getClass(), "lastUsedDeckId", -1918316581);
        setIntField(term301683, term301683.getClass(), "lastPlayMusicLevel", 1204516010);
        setIntField(term301683, term301683.getClass(), "lastEmoneyBrand", -81069572);
        setField(term301681, term301681.getClass(), "user", term301683);
        setIntField(term301681, term301681.getClass(), "bonusId", 508383531);
        setIntField(term301681, term301681.getClass(), "bonusCount", 799664846);
        setField(term301681, term301681.getClass(), "lastUpdateDate", "XizyspPIEi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term301681, args);
    }

};


