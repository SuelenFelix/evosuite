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

public class UserCard_toString_167129472737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132126;

    public UserCard_toString_167129472737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term132132 = new Long(-593735869267672817L);
        term132126 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term132128 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term132130 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term132146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132151 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132161 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term132126, term132126.getClass(), "id", 1719218323423477088L);
        setLongField(term132128, term132128.getClass(), "id", 1085898047571856902L);
        setLongField(term132130, term132130.getClass(), "id", -6329688746788891869L);
        setField(term132130, term132130.getClass(), "extId", term132132);
        setField(term132130, term132130.getClass(), "luid", "rGcDZdOanr");
        setIntField(term132147, term132147.getClass(), "year", 2022);
        setShortField(term132147, term132147.getClass(), "month", (short) 5);
        setShortField(term132147, term132147.getClass(), "day", (short) 26);
        setField(term132146, term132146.getClass(), "date", term132147);
        setByteField(term132151, term132151.getClass(), "hour", (byte) 16);
        setByteField(term132151, term132151.getClass(), "minute", (byte) 7);
        setByteField(term132151, term132151.getClass(), "second", (byte) 6);
        setIntField(term132151, term132151.getClass(), "nano", 65239619);
        setField(term132146, term132146.getClass(), "time", term132151);
        setField(term132130, term132130.getClass(), "registerTime", term132146);
        setIntField(term132157, term132157.getClass(), "year", 2021);
        setShortField(term132157, term132157.getClass(), "month", (short) 4);
        setShortField(term132157, term132157.getClass(), "day", (short) 22);
        setField(term132156, term132156.getClass(), "date", term132157);
        setByteField(term132161, term132161.getClass(), "hour", (byte) 4);
        setByteField(term132161, term132161.getClass(), "minute", (byte) 51);
        setByteField(term132161, term132161.getClass(), "second", (byte) 42);
        setIntField(term132161, term132161.getClass(), "nano", 408430084);
        setField(term132156, term132156.getClass(), "time", term132161);
        setField(term132130, term132130.getClass(), "accessTime", term132156);
        setField(term132128, term132128.getClass(), "card", term132130);
        setField(term132128, term132128.getClass(), "userName", "qlnQoljKQM");
        setIntField(term132128, term132128.getClass(), "level", 757749198);
        setIntField(term132128, term132128.getClass(), "reincarnationNum", 394416625);
        setLongField(term132128, term132128.getClass(), "exp", 7997577383759248511L);
        setLongField(term132128, term132128.getClass(), "point", 8623717781881201385L);
        setLongField(term132128, term132128.getClass(), "totalPoint", 3858697495294637727L);
        setIntField(term132128, term132128.getClass(), "playCount", -385524457);
        setIntField(term132128, term132128.getClass(), "jewelCount", 1453058029);
        setIntField(term132128, term132128.getClass(), "totalJewelCount", 632579504);
        setIntField(term132128, term132128.getClass(), "medalCount", -2066050715);
        setIntField(term132128, term132128.getClass(), "playerRating", 1838644781);
        setIntField(term132128, term132128.getClass(), "highestRating", -342802107);
        setIntField(term132128, term132128.getClass(), "battlePoint", 1875014750);
        setIntField(term132128, term132128.getClass(), "bestBattlePoint", 1774722901);
        setIntField(term132128, term132128.getClass(), "overDamageBattlePoint", 1496592792);
        setBooleanField(term132128, term132128.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term132128, term132128.getClass(), "nameplateId", 1944444886);
        setIntField(term132128, term132128.getClass(), "trophyId", 813872033);
        setIntField(term132128, term132128.getClass(), "cardId", -289587627);
        setIntField(term132128, term132128.getClass(), "characterId", 249117272);
        setIntField(term132128, term132128.getClass(), "characterVoiceNo", 569136290);
        setIntField(term132128, term132128.getClass(), "tabSetting", -769809783);
        setIntField(term132128, term132128.getClass(), "tabSortSetting", -1572273604);
        setIntField(term132128, term132128.getClass(), "cardCategorySetting", -884285296);
        setIntField(term132128, term132128.getClass(), "cardSortSetting", -332552768);
        setIntField(term132128, term132128.getClass(), "rivalScoreCategorySetting", -734809675);
        setIntField(term132128, term132128.getClass(), "playedTutorialBit", -2032445161);
        setIntField(term132128, term132128.getClass(), "firstTutorialCancelNum", 2055666026);
        setLongField(term132128, term132128.getClass(), "sumTechHighScore", -6902156578872716277L);
        setLongField(term132128, term132128.getClass(), "sumTechBasicHighScore", -9017005822384911092L);
        setLongField(term132128, term132128.getClass(), "sumTechAdvancedHighScore", 1992811308989793561L);
        setLongField(term132128, term132128.getClass(), "sumTechExpertHighScore", 4104082557787056386L);
        setLongField(term132128, term132128.getClass(), "sumTechMasterHighScore", 5390231526851993375L);
        setLongField(term132128, term132128.getClass(), "sumTechLunaticHighScore", -7270233309149209810L);
        setLongField(term132128, term132128.getClass(), "sumBattleHighScore", -4840140386886657750L);
        setLongField(term132128, term132128.getClass(), "sumBattleBasicHighScore", 8824724143013573853L);
        setLongField(term132128, term132128.getClass(), "sumBattleAdvancedHighScore", -841032855366504438L);
        setLongField(term132128, term132128.getClass(), "sumBattleExpertHighScore", 5146235473490333526L);
        setLongField(term132128, term132128.getClass(), "sumBattleMasterHighScore", -717904107017578920L);
        setLongField(term132128, term132128.getClass(), "sumBattleLunaticHighScore", -2290981770815216253L);
        setField(term132128, term132128.getClass(), "eventWatchedDate", "RMEDwLGQoG");
        setField(term132128, term132128.getClass(), "cmEventWatchedDate", "wZEFxRSqVY");
        setField(term132128, term132128.getClass(), "firstGameId", "tHcDbcviFO");
        setField(term132128, term132128.getClass(), "firstRomVersion", "cmEWCrpoCO");
        setField(term132128, term132128.getClass(), "firstDataVersion", "OApdoCtolu");
        setField(term132128, term132128.getClass(), "firstPlayDate", "ONkDXTThKL");
        setField(term132128, term132128.getClass(), "lastGameId", "AKbzAaAcmX");
        setField(term132128, term132128.getClass(), "lastRomVersion", "xiloHjgKux");
        setField(term132128, term132128.getClass(), "lastDataVersion", "Pmajvqueiq");
        setField(term132128, term132128.getClass(), "compatibleCmVersion", "VjCLvZgmuN");
        setField(term132128, term132128.getClass(), "lastPlayDate", "tQCalivCMp");
        setIntField(term132128, term132128.getClass(), "lastPlaceId", -961904013);
        setField(term132128, term132128.getClass(), "lastPlaceName", "fEiosUzVPM");
        setIntField(term132128, term132128.getClass(), "lastRegionId", 467298258);
        setField(term132128, term132128.getClass(), "lastRegionName", "USPyxkJGgn");
        setIntField(term132128, term132128.getClass(), "lastAllNetId", -1307824288);
        setField(term132128, term132128.getClass(), "lastClientId", "VniuLGKjLe");
        setIntField(term132128, term132128.getClass(), "lastUsedDeckId", -343537352);
        setIntField(term132128, term132128.getClass(), "lastPlayMusicLevel", -504159112);
        setIntField(term132128, term132128.getClass(), "lastEmoneyBrand", -693581216);
        setField(term132126, term132126.getClass(), "user", term132128);
        setIntField(term132126, term132126.getClass(), "cardId", -1);
        setIntField(term132126, term132126.getClass(), "digitalStock", 1);
        setIntField(term132126, term132126.getClass(), "analogStock", -1414257808);
        setIntField(term132126, term132126.getClass(), "level", -2048269349);
        setIntField(term132126, term132126.getClass(), "maxLevel", 10);
        setIntField(term132126, term132126.getClass(), "exp", 2127262366);
        setIntField(term132126, term132126.getClass(), "printCount", 1192955580);
        setIntField(term132126, term132126.getClass(), "useCount", -1390904271);
        setBooleanField(term132126, term132126.getClass(), "isNew", true);
        setField(term132126, term132126.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term132126, term132126.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term132126, term132126.getClass(), "skillId", 894136168);
        setBooleanField(term132126, term132126.getClass(), "isAcquired", true);
        setField(term132126, term132126.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term132126, args);
    }

};


