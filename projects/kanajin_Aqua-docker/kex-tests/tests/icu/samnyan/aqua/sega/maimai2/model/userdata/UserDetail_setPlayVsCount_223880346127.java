package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setPlayVsCount_223880346127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4302054;
     Object term4302413;

    public UserDetail_setPlayVsCount_223880346127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4302058 = new Long(8371846874123508864L);
        Integer term4302121 = new Integer(357209284);
        Integer term4302123 = new Integer(-1561404518);
        Integer term4302125 = new Integer(1567499135);
        Integer term4302127 = new Integer(1468757593);
        Integer term4302129 = new Integer(-1645647552);
        Integer term4302131 = new Integer(1876056340);
        ArrayList term4302119 = new ArrayList();
        ((ArrayList) term4302119).add(term4302121);
        ((ArrayList) term4302119).add(term4302123);
        ((ArrayList) term4302119).add(term4302125);
        ((ArrayList) term4302119).add(term4302127);
        ((ArrayList) term4302119).add(term4302129);
        ((ArrayList) term4302119).add(term4302131);
        Integer term4302137 = new Integer(-114566575);
        Integer term4302139 = new Integer(-415161512);
        Integer term4302141 = new Integer(-638764759);
        Integer term4302143 = new Integer(-1643368171);
        ArrayList term4302135 = new ArrayList();
        ((ArrayList) term4302135).add(term4302137);
        ((ArrayList) term4302135).add(term4302139);
        ((ArrayList) term4302135).add(term4302141);
        ((ArrayList) term4302135).add(term4302143);
        term4302054 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4302056 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4302072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4302073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4302077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4302082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4302083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4302087 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4302054, term4302054.getClass(), "id", -1866753522293068141L);
        setLongField(term4302056, term4302056.getClass(), "id", -9065423467202941982L);
        setField(term4302056, term4302056.getClass(), "extId", term4302058);
        setField(term4302056, term4302056.getClass(), "luid", "zxynGUBrHs");
        setIntField(term4302073, term4302073.getClass(), "year", 2011);
        setShortField(term4302073, term4302073.getClass(), "month", (short) 6);
        setShortField(term4302073, term4302073.getClass(), "day", (short) 24);
        setField(term4302072, term4302072.getClass(), "date", term4302073);
        setByteField(term4302077, term4302077.getClass(), "hour", (byte) 5);
        setByteField(term4302077, term4302077.getClass(), "minute", (byte) 45);
        setByteField(term4302077, term4302077.getClass(), "second", (byte) 22);
        setIntField(term4302077, term4302077.getClass(), "nano", 657063016);
        setField(term4302072, term4302072.getClass(), "time", term4302077);
        setField(term4302056, term4302056.getClass(), "registerTime", term4302072);
        setIntField(term4302083, term4302083.getClass(), "year", 2017);
        setShortField(term4302083, term4302083.getClass(), "month", (short) 3);
        setShortField(term4302083, term4302083.getClass(), "day", (short) 19);
        setField(term4302082, term4302082.getClass(), "date", term4302083);
        setByteField(term4302087, term4302087.getClass(), "hour", (byte) 18);
        setByteField(term4302087, term4302087.getClass(), "minute", (byte) 25);
        setByteField(term4302087, term4302087.getClass(), "second", (byte) 43);
        setIntField(term4302087, term4302087.getClass(), "nano", 951884245);
        setField(term4302082, term4302082.getClass(), "time", term4302087);
        setField(term4302056, term4302056.getClass(), "accessTime", term4302082);
        setField(term4302054, term4302054.getClass(), "card", term4302056);
        setField(term4302054, term4302054.getClass(), "userName", "IytsSILCdT");
        setIntField(term4302054, term4302054.getClass(), "isNetMember", -515947210);
        setIntField(term4302054, term4302054.getClass(), "iconId", -1922616864);
        setIntField(term4302054, term4302054.getClass(), "plateId", -825444686);
        setIntField(term4302054, term4302054.getClass(), "titleId", -805290506);
        setIntField(term4302054, term4302054.getClass(), "partnerId", 335151527);
        setIntField(term4302054, term4302054.getClass(), "frameId", 1802535617);
        setIntField(term4302054, term4302054.getClass(), "selectMapId", -1593296854);
        setIntField(term4302054, term4302054.getClass(), "totalAwake", -1439781614);
        setIntField(term4302054, term4302054.getClass(), "gradeRating", 350949598);
        setIntField(term4302054, term4302054.getClass(), "musicRating", -2081589205);
        setIntField(term4302054, term4302054.getClass(), "playerRating", 579257267);
        setIntField(term4302054, term4302054.getClass(), "highestRating", 1002532519);
        setIntField(term4302054, term4302054.getClass(), "gradeRank", 1370162770);
        setIntField(term4302054, term4302054.getClass(), "classRank", -1385025597);
        setIntField(term4302054, term4302054.getClass(), "courseRank", 440201770);
        setField(term4302054, term4302054.getClass(), "charaSlot", term4302119);
        setField(term4302054, term4302054.getClass(), "charaLockSlot", term4302135);
        setLongField(term4302054, term4302054.getClass(), "contentBit", -6397782659834279757L);
        setIntField(term4302054, term4302054.getClass(), "playCount", 766550219);
        setField(term4302054, term4302054.getClass(), "eventWatchedDate", "kCsaweUmBW");
        setField(term4302054, term4302054.getClass(), "lastGameId", "PEjdALAYaG");
        setField(term4302054, term4302054.getClass(), "lastRomVersion", "IXXvQGRDmJ");
        setField(term4302054, term4302054.getClass(), "lastDataVersion", "tSdaRsTVlO");
        setField(term4302054, term4302054.getClass(), "lastLoginDate", "KiVTvIhSiu");
        setField(term4302054, term4302054.getClass(), "lastPlayDate", "IJOSXwQfvw");
        setIntField(term4302054, term4302054.getClass(), "lastPlayCredit", -14765002);
        setIntField(term4302054, term4302054.getClass(), "lastPlayMode", 759917489);
        setIntField(term4302054, term4302054.getClass(), "lastPlaceId", 1412466420);
        setField(term4302054, term4302054.getClass(), "lastPlaceName", "kMPcIcqdjR");
        setIntField(term4302054, term4302054.getClass(), "lastAllNetId", 1519707931);
        setIntField(term4302054, term4302054.getClass(), "lastRegionId", -772361950);
        setField(term4302054, term4302054.getClass(), "lastRegionName", "kKFHjGIydW");
        setField(term4302054, term4302054.getClass(), "lastClientId", "fAssHZjfgG");
        setField(term4302054, term4302054.getClass(), "lastCountryCode", "oWOdODdnCs");
        setIntField(term4302054, term4302054.getClass(), "lastSelectEMoney", 1124847984);
        setIntField(term4302054, term4302054.getClass(), "lastSelectTicket", -1233213374);
        setIntField(term4302054, term4302054.getClass(), "lastSelectCourse", 797603751);
        setIntField(term4302054, term4302054.getClass(), "lastCountCourse", -974187534);
        setField(term4302054, term4302054.getClass(), "firstGameId", "ebCIbfvJiC");
        setField(term4302054, term4302054.getClass(), "firstRomVersion", "EqolqkZQvP");
        setField(term4302054, term4302054.getClass(), "firstDataVersion", "tYTiSCndHj");
        setField(term4302054, term4302054.getClass(), "firstPlayDate", "iaFnJOURHX");
        setField(term4302054, term4302054.getClass(), "compatibleCmVersion", "VpWGUFRVqm");
        setField(term4302054, term4302054.getClass(), "dailyBonusDate", "nfCHVHZAsI");
        setField(term4302054, term4302054.getClass(), "dailyCourseBonusDate", "aISKXBbryR");
        setField(term4302054, term4302054.getClass(), "lastPairLoginDate", "EcZXPqTpiO");
        setField(term4302054, term4302054.getClass(), "lastTrialPlayDate", "wxTNDeRSKP");
        setIntField(term4302054, term4302054.getClass(), "playVsCount", 799916517);
        setIntField(term4302054, term4302054.getClass(), "playSyncCount", 1029101463);
        setIntField(term4302054, term4302054.getClass(), "winCount", 50561838);
        setIntField(term4302054, term4302054.getClass(), "helpCount", 1190431214);
        setIntField(term4302054, term4302054.getClass(), "comboCount", -1385029965);
        setLongField(term4302054, term4302054.getClass(), "totalDeluxscore", 1561150382541130076L);
        setLongField(term4302054, term4302054.getClass(), "totalBasicDeluxscore", -4449292379737620539L);
        setLongField(term4302054, term4302054.getClass(), "totalAdvancedDeluxscore", 5738040108149821749L);
        setLongField(term4302054, term4302054.getClass(), "totalExpertDeluxscore", 837232606313327573L);
        setLongField(term4302054, term4302054.getClass(), "totalMasterDeluxscore", 5895798762639187050L);
        setLongField(term4302054, term4302054.getClass(), "totalReMasterDeluxscore", 5991739477030661843L);
        setIntField(term4302054, term4302054.getClass(), "totalSync", -342987130);
        setIntField(term4302054, term4302054.getClass(), "totalBasicSync", 39611530);
        setIntField(term4302054, term4302054.getClass(), "totalAdvancedSync", 973220651);
        setIntField(term4302054, term4302054.getClass(), "totalExpertSync", -2024435507);
        setIntField(term4302054, term4302054.getClass(), "totalMasterSync", 224961472);
        setIntField(term4302054, term4302054.getClass(), "totalReMasterSync", 1832354669);
        setLongField(term4302054, term4302054.getClass(), "totalAchievement", 8093397261518301254L);
        setLongField(term4302054, term4302054.getClass(), "totalBasicAchievement", -7193021022076663694L);
        setLongField(term4302054, term4302054.getClass(), "totalAdvancedAchievement", -2178654464039199L);
        setLongField(term4302054, term4302054.getClass(), "totalExpertAchievement", -1462444321346976686L);
        setLongField(term4302054, term4302054.getClass(), "totalMasterAchievement", -6850704436399631383L);
        setLongField(term4302054, term4302054.getClass(), "totalReMasterAchievement", 7339092582799140448L);
        setLongField(term4302054, term4302054.getClass(), "playerOldRating", -3231020334748790364L);
        setLongField(term4302054, term4302054.getClass(), "playerNewRating", -3084202190261569155L);
        setIntField(term4302054, term4302054.getClass(), "banState", -488787664);
        setLongField(term4302054, term4302054.getClass(), "dateTime", -5349260827137519052L);
        term4302413 = new Integer(444277836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4302413;
        callMethod(klass, "setPlayVsCount", argTypes, term4302054, args);
    }

};


