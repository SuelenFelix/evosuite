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

public class UserGeneralData_getPropertyKey_21019081793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295151;

    public UserGeneralData_getPropertyKey_21019081793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term295157 = new Long(-5671086125367688052L);
        term295151 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term295153 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term295155 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term295171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term295181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295186 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term295151, term295151.getClass(), "id", 161065113804458310L);
        setLongField(term295153, term295153.getClass(), "id", -7793687253724707445L);
        setLongField(term295155, term295155.getClass(), "id", 5183057524875832910L);
        setField(term295155, term295155.getClass(), "extId", term295157);
        setField(term295155, term295155.getClass(), "luid", "OLrThOaeRP");
        setIntField(term295172, term295172.getClass(), "year", 2014);
        setShortField(term295172, term295172.getClass(), "month", (short) 9);
        setShortField(term295172, term295172.getClass(), "day", (short) 2);
        setField(term295171, term295171.getClass(), "date", term295172);
        setByteField(term295176, term295176.getClass(), "hour", (byte) 23);
        setByteField(term295176, term295176.getClass(), "minute", (byte) 20);
        setByteField(term295176, term295176.getClass(), "second", (byte) 59);
        setIntField(term295176, term295176.getClass(), "nano", 509609168);
        setField(term295171, term295171.getClass(), "time", term295176);
        setField(term295155, term295155.getClass(), "registerTime", term295171);
        setIntField(term295182, term295182.getClass(), "year", 2029);
        setShortField(term295182, term295182.getClass(), "month", (short) 7);
        setShortField(term295182, term295182.getClass(), "day", (short) 28);
        setField(term295181, term295181.getClass(), "date", term295182);
        setByteField(term295186, term295186.getClass(), "hour", (byte) 8);
        setByteField(term295186, term295186.getClass(), "minute", (byte) 18);
        setByteField(term295186, term295186.getClass(), "second", (byte) 36);
        setIntField(term295186, term295186.getClass(), "nano", 926469870);
        setField(term295181, term295181.getClass(), "time", term295186);
        setField(term295155, term295155.getClass(), "accessTime", term295181);
        setField(term295153, term295153.getClass(), "card", term295155);
        setField(term295153, term295153.getClass(), "userName", "PXaTZfbXEG");
        setIntField(term295153, term295153.getClass(), "level", 1101421168);
        setIntField(term295153, term295153.getClass(), "reincarnationNum", 1027189807);
        setLongField(term295153, term295153.getClass(), "exp", 5026278517604840545L);
        setLongField(term295153, term295153.getClass(), "point", -45484424031960660L);
        setLongField(term295153, term295153.getClass(), "totalPoint", 3799538396389035542L);
        setIntField(term295153, term295153.getClass(), "playCount", 426977394);
        setIntField(term295153, term295153.getClass(), "jewelCount", 1154094596);
        setIntField(term295153, term295153.getClass(), "totalJewelCount", 554527750);
        setIntField(term295153, term295153.getClass(), "medalCount", -1736705145);
        setIntField(term295153, term295153.getClass(), "playerRating", 1968125832);
        setIntField(term295153, term295153.getClass(), "highestRating", 277927909);
        setIntField(term295153, term295153.getClass(), "battlePoint", -63485281);
        setIntField(term295153, term295153.getClass(), "bestBattlePoint", -1261440186);
        setIntField(term295153, term295153.getClass(), "overDamageBattlePoint", -1304169337);
        setBooleanField(term295153, term295153.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term295153, term295153.getClass(), "nameplateId", -677587688);
        setIntField(term295153, term295153.getClass(), "trophyId", -337851972);
        setIntField(term295153, term295153.getClass(), "cardId", -318815497);
        setIntField(term295153, term295153.getClass(), "characterId", -336417598);
        setIntField(term295153, term295153.getClass(), "characterVoiceNo", 882631772);
        setIntField(term295153, term295153.getClass(), "tabSetting", -1090034911);
        setIntField(term295153, term295153.getClass(), "tabSortSetting", -886045847);
        setIntField(term295153, term295153.getClass(), "cardCategorySetting", 1694984912);
        setIntField(term295153, term295153.getClass(), "cardSortSetting", 324525460);
        setIntField(term295153, term295153.getClass(), "rivalScoreCategorySetting", -171650652);
        setIntField(term295153, term295153.getClass(), "playedTutorialBit", -1209525509);
        setIntField(term295153, term295153.getClass(), "firstTutorialCancelNum", 2121252734);
        setLongField(term295153, term295153.getClass(), "sumTechHighScore", -4013765281357365562L);
        setLongField(term295153, term295153.getClass(), "sumTechBasicHighScore", 1240657139456327138L);
        setLongField(term295153, term295153.getClass(), "sumTechAdvancedHighScore", -8788626737334335171L);
        setLongField(term295153, term295153.getClass(), "sumTechExpertHighScore", -5211894504751128433L);
        setLongField(term295153, term295153.getClass(), "sumTechMasterHighScore", -4582942841515618259L);
        setLongField(term295153, term295153.getClass(), "sumTechLunaticHighScore", -8484258788883913891L);
        setLongField(term295153, term295153.getClass(), "sumBattleHighScore", -6555589096138628685L);
        setLongField(term295153, term295153.getClass(), "sumBattleBasicHighScore", -6117522299399000795L);
        setLongField(term295153, term295153.getClass(), "sumBattleAdvancedHighScore", -8340877814214495569L);
        setLongField(term295153, term295153.getClass(), "sumBattleExpertHighScore", 4993445525286827456L);
        setLongField(term295153, term295153.getClass(), "sumBattleMasterHighScore", 650175157523570378L);
        setLongField(term295153, term295153.getClass(), "sumBattleLunaticHighScore", 3537136884729360297L);
        setField(term295153, term295153.getClass(), "eventWatchedDate", "euhRkgIHwR");
        setField(term295153, term295153.getClass(), "cmEventWatchedDate", "fGCjMhYeuP");
        setField(term295153, term295153.getClass(), "firstGameId", "tQRvyNwDqB");
        setField(term295153, term295153.getClass(), "firstRomVersion", "dIKNQsSoMj");
        setField(term295153, term295153.getClass(), "firstDataVersion", "HqjQGEpUiH");
        setField(term295153, term295153.getClass(), "firstPlayDate", "BtiUMsmVbh");
        setField(term295153, term295153.getClass(), "lastGameId", "INHNqaImEM");
        setField(term295153, term295153.getClass(), "lastRomVersion", "vPIneuzFyr");
        setField(term295153, term295153.getClass(), "lastDataVersion", "eGDUBxxnZQ");
        setField(term295153, term295153.getClass(), "compatibleCmVersion", "mFAJYTcPxb");
        setField(term295153, term295153.getClass(), "lastPlayDate", "kEeOXwuQLs");
        setIntField(term295153, term295153.getClass(), "lastPlaceId", 75850153);
        setField(term295153, term295153.getClass(), "lastPlaceName", "MyeSojBBPn");
        setIntField(term295153, term295153.getClass(), "lastRegionId", 905512263);
        setField(term295153, term295153.getClass(), "lastRegionName", "IBEiicEMis");
        setIntField(term295153, term295153.getClass(), "lastAllNetId", -1288953319);
        setField(term295153, term295153.getClass(), "lastClientId", "bWUMMMnrsO");
        setIntField(term295153, term295153.getClass(), "lastUsedDeckId", 1820370438);
        setIntField(term295153, term295153.getClass(), "lastPlayMusicLevel", -505627473);
        setIntField(term295153, term295153.getClass(), "lastEmoneyBrand", 911393929);
        setField(term295151, term295151.getClass(), "user", term295153);
        setField(term295151, term295151.getClass(), "propertyKey", "QMuSzIUAqW");
        setField(term295151, term295151.getClass(), "propertyValue", "ecDNTpPdOH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPropertyKey", argTypes, term295151, args);
    }

};


