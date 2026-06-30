package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getNameplateId_170802130516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102486;

    public ExternalUserData_getNameplateId_170802130516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102486 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term102486, term102486.getClass(), "accessCode", "ziUiwLAztn");
        setField(term102486, term102486.getClass(), "userName", "vHbDlHjnmH");
        setIntField(term102486, term102486.getClass(), "level", -253238969);
        setIntField(term102486, term102486.getClass(), "reincarnationNum", 1050866203);
        setLongField(term102486, term102486.getClass(), "exp", 5744771612927945158L);
        setLongField(term102486, term102486.getClass(), "point", 9060109026753038742L);
        setLongField(term102486, term102486.getClass(), "totalPoint", 6241619707576176809L);
        setIntField(term102486, term102486.getClass(), "playCount", -656067139);
        setIntField(term102486, term102486.getClass(), "jewelCount", -1527456464);
        setIntField(term102486, term102486.getClass(), "totalJewelCount", -86199518);
        setIntField(term102486, term102486.getClass(), "medalCount", 918502014);
        setIntField(term102486, term102486.getClass(), "playerRating", -912701929);
        setIntField(term102486, term102486.getClass(), "highestRating", -953984612);
        setIntField(term102486, term102486.getClass(), "battlePoint", 68433516);
        setIntField(term102486, term102486.getClass(), "bestBattlePoint", -1342172889);
        setIntField(term102486, term102486.getClass(), "overDamageBattlePoint", 187925959);
        setIntField(term102486, term102486.getClass(), "nameplateId", 475145690);
        setIntField(term102486, term102486.getClass(), "trophyId", -672313691);
        setIntField(term102486, term102486.getClass(), "cardId", -604910187);
        setIntField(term102486, term102486.getClass(), "characterId", 1648083419);
        setIntField(term102486, term102486.getClass(), "tabSetting", -1418226353);
        setIntField(term102486, term102486.getClass(), "tabSortSetting", -1741475581);
        setIntField(term102486, term102486.getClass(), "cardCategorySetting", 1728453689);
        setIntField(term102486, term102486.getClass(), "cardSortSetting", 1928363637);
        setIntField(term102486, term102486.getClass(), "rivalScoreCategorySetting", -1121758298);
        setIntField(term102486, term102486.getClass(), "playedTutorialBit", -945758276);
        setIntField(term102486, term102486.getClass(), "firstTutorialCancelNum", -1375825300);
        setLongField(term102486, term102486.getClass(), "sumTechHighScore", 4953585455715516972L);
        setLongField(term102486, term102486.getClass(), "sumTechBasicHighScore", -1117078534769352716L);
        setLongField(term102486, term102486.getClass(), "sumTechAdvancedHighScore", -3556477439377377607L);
        setLongField(term102486, term102486.getClass(), "sumTechExpertHighScore", -2888976981013426911L);
        setLongField(term102486, term102486.getClass(), "sumTechMasterHighScore", -3841393745504397353L);
        setLongField(term102486, term102486.getClass(), "sumTechLunaticHighScore", 3440605481200518402L);
        setLongField(term102486, term102486.getClass(), "sumBattleHighScore", 5153511211529927634L);
        setLongField(term102486, term102486.getClass(), "sumBattleBasicHighScore", 5936043033481765124L);
        setLongField(term102486, term102486.getClass(), "sumBattleAdvancedHighScore", -4021882870461833333L);
        setLongField(term102486, term102486.getClass(), "sumBattleExpertHighScore", -6927359252849693512L);
        setLongField(term102486, term102486.getClass(), "sumBattleMasterHighScore", -4885312547111808609L);
        setLongField(term102486, term102486.getClass(), "sumBattleLunaticHighScore", 3688228847736962959L);
        setField(term102486, term102486.getClass(), "eventWatchedDate", "PXyqSkkwbT");
        setField(term102486, term102486.getClass(), "cmEventWatchedDate", "dtCvEKxkmc");
        setField(term102486, term102486.getClass(), "firstGameId", "kYWWIZVVxi");
        setField(term102486, term102486.getClass(), "firstRomVersion", "BSybZnyoXb");
        setField(term102486, term102486.getClass(), "firstDataVersion", "FtBTdccLAQ");
        setField(term102486, term102486.getClass(), "firstPlayDate", "rHmLJyEYmZ");
        setField(term102486, term102486.getClass(), "lastGameId", "tigJNweXMN");
        setField(term102486, term102486.getClass(), "lastRomVersion", "CBAuoOPQLk");
        setField(term102486, term102486.getClass(), "lastDataVersion", "UMceVhSAUg");
        setField(term102486, term102486.getClass(), "compatibleCmVersion", "ZXXTHSAYBb");
        setField(term102486, term102486.getClass(), "lastPlayDate", "VBWbEmjxRb");
        setIntField(term102486, term102486.getClass(), "lastPlaceId", 1032138158);
        setField(term102486, term102486.getClass(), "lastPlaceName", "LKrcKuVLVI");
        setIntField(term102486, term102486.getClass(), "lastRegionId", -109274141);
        setField(term102486, term102486.getClass(), "lastRegionName", "mUNHplmJbZ");
        setIntField(term102486, term102486.getClass(), "lastAllNetId", -1828022907);
        setField(term102486, term102486.getClass(), "lastClientId", "yxcEKhJUJL");
        setIntField(term102486, term102486.getClass(), "lastUsedDeckId", -1328018013);
        setIntField(term102486, term102486.getClass(), "lastPlayMusicLevel", -539856714);
        setIntField(term102486, term102486.getClass(), "lastEmoneyBrand", -2147201865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term102486, args);
    }

};


