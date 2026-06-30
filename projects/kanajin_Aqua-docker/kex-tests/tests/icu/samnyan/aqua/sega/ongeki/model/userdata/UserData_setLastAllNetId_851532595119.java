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

public class UserData_setLastAllNetId_851532595119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72693;
     Object term72956;

    public UserData_setLastAllNetId_851532595119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term72697 = new Long(4616440478358528406L);
        term72693 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term72695 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term72711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72716 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72726 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term72693, term72693.getClass(), "id", 2030253959753351191L);
        setLongField(term72695, term72695.getClass(), "id", 6362772764317235471L);
        setField(term72695, term72695.getClass(), "extId", term72697);
        setField(term72695, term72695.getClass(), "luid", "cQnJIENJHe");
        setIntField(term72712, term72712.getClass(), "year", 2016);
        setShortField(term72712, term72712.getClass(), "month", (short) 2);
        setShortField(term72712, term72712.getClass(), "day", (short) 12);
        setField(term72711, term72711.getClass(), "date", term72712);
        setByteField(term72716, term72716.getClass(), "hour", (byte) 7);
        setByteField(term72716, term72716.getClass(), "minute", (byte) 16);
        setByteField(term72716, term72716.getClass(), "second", (byte) 55);
        setIntField(term72716, term72716.getClass(), "nano", 690063047);
        setField(term72711, term72711.getClass(), "time", term72716);
        setField(term72695, term72695.getClass(), "registerTime", term72711);
        setIntField(term72722, term72722.getClass(), "year", 2019);
        setShortField(term72722, term72722.getClass(), "month", (short) 3);
        setShortField(term72722, term72722.getClass(), "day", (short) 19);
        setField(term72721, term72721.getClass(), "date", term72722);
        setByteField(term72726, term72726.getClass(), "hour", (byte) 19);
        setByteField(term72726, term72726.getClass(), "minute", (byte) 24);
        setByteField(term72726, term72726.getClass(), "second", (byte) 21);
        setIntField(term72726, term72726.getClass(), "nano", 765889037);
        setField(term72721, term72721.getClass(), "time", term72726);
        setField(term72695, term72695.getClass(), "accessTime", term72721);
        setField(term72693, term72693.getClass(), "card", term72695);
        setField(term72693, term72693.getClass(), "userName", "ExjdCvAxlG");
        setIntField(term72693, term72693.getClass(), "level", -576638264);
        setIntField(term72693, term72693.getClass(), "reincarnationNum", -582124031);
        setLongField(term72693, term72693.getClass(), "exp", 1215709099559006092L);
        setLongField(term72693, term72693.getClass(), "point", -172822749745985404L);
        setLongField(term72693, term72693.getClass(), "totalPoint", -2843381080508194463L);
        setIntField(term72693, term72693.getClass(), "playCount", -1908433542);
        setIntField(term72693, term72693.getClass(), "jewelCount", 700489923);
        setIntField(term72693, term72693.getClass(), "totalJewelCount", -1490991707);
        setIntField(term72693, term72693.getClass(), "medalCount", -1869327557);
        setIntField(term72693, term72693.getClass(), "playerRating", -1846337897);
        setIntField(term72693, term72693.getClass(), "highestRating", 1156768326);
        setIntField(term72693, term72693.getClass(), "battlePoint", -393842466);
        setIntField(term72693, term72693.getClass(), "bestBattlePoint", 2011572896);
        setIntField(term72693, term72693.getClass(), "overDamageBattlePoint", 1517650676);
        setBooleanField(term72693, term72693.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term72693, term72693.getClass(), "nameplateId", -1559743160);
        setIntField(term72693, term72693.getClass(), "trophyId", -2067828357);
        setIntField(term72693, term72693.getClass(), "cardId", -2049221981);
        setIntField(term72693, term72693.getClass(), "characterId", 2046964718);
        setIntField(term72693, term72693.getClass(), "characterVoiceNo", 1610353449);
        setIntField(term72693, term72693.getClass(), "tabSetting", -1431201540);
        setIntField(term72693, term72693.getClass(), "tabSortSetting", 921611666);
        setIntField(term72693, term72693.getClass(), "cardCategorySetting", 505159138);
        setIntField(term72693, term72693.getClass(), "cardSortSetting", 816436710);
        setIntField(term72693, term72693.getClass(), "rivalScoreCategorySetting", 1372386941);
        setIntField(term72693, term72693.getClass(), "playedTutorialBit", -558285340);
        setIntField(term72693, term72693.getClass(), "firstTutorialCancelNum", -1351747599);
        setLongField(term72693, term72693.getClass(), "sumTechHighScore", 3880291114635681794L);
        setLongField(term72693, term72693.getClass(), "sumTechBasicHighScore", 5004839268187097411L);
        setLongField(term72693, term72693.getClass(), "sumTechAdvancedHighScore", -6710070540839416735L);
        setLongField(term72693, term72693.getClass(), "sumTechExpertHighScore", -8433345414293758986L);
        setLongField(term72693, term72693.getClass(), "sumTechMasterHighScore", 1110155966563942771L);
        setLongField(term72693, term72693.getClass(), "sumTechLunaticHighScore", 269702656736355889L);
        setLongField(term72693, term72693.getClass(), "sumBattleHighScore", 8166421484573894031L);
        setLongField(term72693, term72693.getClass(), "sumBattleBasicHighScore", -3024937128077447738L);
        setLongField(term72693, term72693.getClass(), "sumBattleAdvancedHighScore", -6300837665282567859L);
        setLongField(term72693, term72693.getClass(), "sumBattleExpertHighScore", 2113641641337585926L);
        setLongField(term72693, term72693.getClass(), "sumBattleMasterHighScore", 3949301078476867469L);
        setLongField(term72693, term72693.getClass(), "sumBattleLunaticHighScore", -7128719881532368798L);
        setField(term72693, term72693.getClass(), "eventWatchedDate", "moMySSiBuB");
        setField(term72693, term72693.getClass(), "cmEventWatchedDate", "iuuazALDWB");
        setField(term72693, term72693.getClass(), "firstGameId", "GqehccUels");
        setField(term72693, term72693.getClass(), "firstRomVersion", "llbDGujrPe");
        setField(term72693, term72693.getClass(), "firstDataVersion", "QEoeITwBfz");
        setField(term72693, term72693.getClass(), "firstPlayDate", "rWOKjAUIvS");
        setField(term72693, term72693.getClass(), "lastGameId", "IcpfsIGlDf");
        setField(term72693, term72693.getClass(), "lastRomVersion", "xCfGcRdHTK");
        setField(term72693, term72693.getClass(), "lastDataVersion", "KKHQCvKTvF");
        setField(term72693, term72693.getClass(), "compatibleCmVersion", "XBhNIIxiNP");
        setField(term72693, term72693.getClass(), "lastPlayDate", "JljyXnwkuC");
        setIntField(term72693, term72693.getClass(), "lastPlaceId", 376811147);
        setField(term72693, term72693.getClass(), "lastPlaceName", "XLOxkLyvMY");
        setIntField(term72693, term72693.getClass(), "lastRegionId", 1230466580);
        setField(term72693, term72693.getClass(), "lastRegionName", "pjUyKHjjKH");
        setIntField(term72693, term72693.getClass(), "lastAllNetId", -367049771);
        setField(term72693, term72693.getClass(), "lastClientId", "JApuaiAykc");
        setIntField(term72693, term72693.getClass(), "lastUsedDeckId", 469812226);
        setIntField(term72693, term72693.getClass(), "lastPlayMusicLevel", 1798598374);
        setIntField(term72693, term72693.getClass(), "lastEmoneyBrand", -1689820547);
        term72956 = new Integer(100902964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term72956;
        callMethod(klass, "setLastAllNetId", argTypes, term72693, args);
    }

};


