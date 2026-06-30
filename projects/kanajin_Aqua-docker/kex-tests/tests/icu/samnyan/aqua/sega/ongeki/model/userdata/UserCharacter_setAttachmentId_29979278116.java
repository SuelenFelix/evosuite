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

public class UserCharacter_setAttachmentId_29979278116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175418;
     Object term175703;

    public UserCharacter_setAttachmentId_29979278116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term175424 = new Long(-8692119547314358088L);
        term175418 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term175420 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term175422 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term175438 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term175439 = newInstance(Class.forName("java.time.LocalDate"));
        Object term175443 = newInstance(Class.forName("java.time.LocalTime"));
        Object term175448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term175449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term175453 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term175418, term175418.getClass(), "id", -437906661461805469L);
        setLongField(term175420, term175420.getClass(), "id", -3244543062859719956L);
        setLongField(term175422, term175422.getClass(), "id", 7759324234094611300L);
        setField(term175422, term175422.getClass(), "extId", term175424);
        setField(term175422, term175422.getClass(), "luid", "LOiINrsGIv");
        setIntField(term175439, term175439.getClass(), "year", 2018);
        setShortField(term175439, term175439.getClass(), "month", (short) 10);
        setShortField(term175439, term175439.getClass(), "day", (short) 20);
        setField(term175438, term175438.getClass(), "date", term175439);
        setByteField(term175443, term175443.getClass(), "hour", (byte) 3);
        setByteField(term175443, term175443.getClass(), "minute", (byte) 46);
        setByteField(term175443, term175443.getClass(), "second", (byte) 11);
        setIntField(term175443, term175443.getClass(), "nano", 355046607);
        setField(term175438, term175438.getClass(), "time", term175443);
        setField(term175422, term175422.getClass(), "registerTime", term175438);
        setIntField(term175449, term175449.getClass(), "year", 2021);
        setShortField(term175449, term175449.getClass(), "month", (short) 6);
        setShortField(term175449, term175449.getClass(), "day", (short) 25);
        setField(term175448, term175448.getClass(), "date", term175449);
        setByteField(term175453, term175453.getClass(), "hour", (byte) 14);
        setByteField(term175453, term175453.getClass(), "minute", (byte) 46);
        setByteField(term175453, term175453.getClass(), "second", (byte) 35);
        setIntField(term175453, term175453.getClass(), "nano", 585866950);
        setField(term175448, term175448.getClass(), "time", term175453);
        setField(term175422, term175422.getClass(), "accessTime", term175448);
        setField(term175420, term175420.getClass(), "card", term175422);
        setField(term175420, term175420.getClass(), "userName", "LGwSNWIJXQ");
        setIntField(term175420, term175420.getClass(), "level", 191523655);
        setIntField(term175420, term175420.getClass(), "reincarnationNum", -832407103);
        setLongField(term175420, term175420.getClass(), "exp", 3548274164116003787L);
        setLongField(term175420, term175420.getClass(), "point", 8851868500913360L);
        setLongField(term175420, term175420.getClass(), "totalPoint", -3707459543384493521L);
        setIntField(term175420, term175420.getClass(), "playCount", -114759282);
        setIntField(term175420, term175420.getClass(), "jewelCount", -1514675613);
        setIntField(term175420, term175420.getClass(), "totalJewelCount", -62146428);
        setIntField(term175420, term175420.getClass(), "medalCount", 1979408142);
        setIntField(term175420, term175420.getClass(), "playerRating", 244805374);
        setIntField(term175420, term175420.getClass(), "highestRating", 1475972131);
        setIntField(term175420, term175420.getClass(), "battlePoint", 1397062904);
        setIntField(term175420, term175420.getClass(), "bestBattlePoint", 1176883487);
        setIntField(term175420, term175420.getClass(), "overDamageBattlePoint", -6078648);
        setBooleanField(term175420, term175420.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term175420, term175420.getClass(), "nameplateId", 709977602);
        setIntField(term175420, term175420.getClass(), "trophyId", -205363548);
        setIntField(term175420, term175420.getClass(), "cardId", 221170469);
        setIntField(term175420, term175420.getClass(), "characterId", -177915923);
        setIntField(term175420, term175420.getClass(), "characterVoiceNo", 931656903);
        setIntField(term175420, term175420.getClass(), "tabSetting", 1825828626);
        setIntField(term175420, term175420.getClass(), "tabSortSetting", 807800350);
        setIntField(term175420, term175420.getClass(), "cardCategorySetting", 1099637519);
        setIntField(term175420, term175420.getClass(), "cardSortSetting", 1826276270);
        setIntField(term175420, term175420.getClass(), "rivalScoreCategorySetting", 265732302);
        setIntField(term175420, term175420.getClass(), "playedTutorialBit", 552831797);
        setIntField(term175420, term175420.getClass(), "firstTutorialCancelNum", -1355031554);
        setLongField(term175420, term175420.getClass(), "sumTechHighScore", -5137330388030558994L);
        setLongField(term175420, term175420.getClass(), "sumTechBasicHighScore", 739264413560387302L);
        setLongField(term175420, term175420.getClass(), "sumTechAdvancedHighScore", -3816220264218624205L);
        setLongField(term175420, term175420.getClass(), "sumTechExpertHighScore", -4407024508993584240L);
        setLongField(term175420, term175420.getClass(), "sumTechMasterHighScore", 6873819782995916960L);
        setLongField(term175420, term175420.getClass(), "sumTechLunaticHighScore", 6346125030799197098L);
        setLongField(term175420, term175420.getClass(), "sumBattleHighScore", -2863919787219340696L);
        setLongField(term175420, term175420.getClass(), "sumBattleBasicHighScore", -4732637787958111800L);
        setLongField(term175420, term175420.getClass(), "sumBattleAdvancedHighScore", 7978864878762652373L);
        setLongField(term175420, term175420.getClass(), "sumBattleExpertHighScore", 7483951906157896993L);
        setLongField(term175420, term175420.getClass(), "sumBattleMasterHighScore", 3362378115560931435L);
        setLongField(term175420, term175420.getClass(), "sumBattleLunaticHighScore", -879107385219460272L);
        setField(term175420, term175420.getClass(), "eventWatchedDate", "WcGFvwYDik");
        setField(term175420, term175420.getClass(), "cmEventWatchedDate", "CoLFqLIXQj");
        setField(term175420, term175420.getClass(), "firstGameId", "kMBzkwoyLv");
        setField(term175420, term175420.getClass(), "firstRomVersion", "HSeKlRlkYL");
        setField(term175420, term175420.getClass(), "firstDataVersion", "BtDbrubSGw");
        setField(term175420, term175420.getClass(), "firstPlayDate", "PRVkoUMIaY");
        setField(term175420, term175420.getClass(), "lastGameId", "xPSCSnxHTM");
        setField(term175420, term175420.getClass(), "lastRomVersion", "UOeypJogpl");
        setField(term175420, term175420.getClass(), "lastDataVersion", "mjUUYdpjfv");
        setField(term175420, term175420.getClass(), "compatibleCmVersion", "prtrXFIoiL");
        setField(term175420, term175420.getClass(), "lastPlayDate", "bgbZhsprUy");
        setIntField(term175420, term175420.getClass(), "lastPlaceId", 74248043);
        setField(term175420, term175420.getClass(), "lastPlaceName", "TgNvNQktbD");
        setIntField(term175420, term175420.getClass(), "lastRegionId", -822902763);
        setField(term175420, term175420.getClass(), "lastRegionName", "aowlHueamt");
        setIntField(term175420, term175420.getClass(), "lastAllNetId", -311521176);
        setField(term175420, term175420.getClass(), "lastClientId", "EjbERDtyDN");
        setIntField(term175420, term175420.getClass(), "lastUsedDeckId", -1589597933);
        setIntField(term175420, term175420.getClass(), "lastPlayMusicLevel", 721870191);
        setIntField(term175420, term175420.getClass(), "lastEmoneyBrand", -115938612);
        setField(term175418, term175418.getClass(), "user", term175420);
        setIntField(term175418, term175418.getClass(), "characterId", 1101568875);
        setIntField(term175418, term175418.getClass(), "costumeId", 1737088701);
        setIntField(term175418, term175418.getClass(), "attachmentId", 1115923305);
        setIntField(term175418, term175418.getClass(), "playCount", -1288207437);
        setIntField(term175418, term175418.getClass(), "intimateLevel", -1906837813);
        setIntField(term175418, term175418.getClass(), "intimateCount", 2029133784);
        setIntField(term175418, term175418.getClass(), "intimateCountRewarded", 187622159);
        setField(term175418, term175418.getClass(), "intimateCountDate", "FqtPXJpAIf");
        setBooleanField(term175418, term175418.getClass(), "isNew", true);
        term175703 = new Integer(2037267674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term175703;
        callMethod(klass, "setAttachmentId", argTypes, term175418, args);
    }

};


