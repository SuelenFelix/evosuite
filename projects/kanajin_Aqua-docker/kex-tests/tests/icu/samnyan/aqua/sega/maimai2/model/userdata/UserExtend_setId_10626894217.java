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

public class UserExtend_setId_10626894217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151507;
     Object term151892;

    public UserExtend_setId_10626894217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term151513 = new Long(3666226122807672448L);
        Integer term151576 = new Integer(-1304965721);
        Integer term151578 = new Integer(1661411651);
        Integer term151580 = new Integer(175517901);
        Integer term151582 = new Integer(335030203);
        Integer term151584 = new Integer(-474014477);
        ArrayList term151574 = new ArrayList();
        ((ArrayList) term151574).add(term151576);
        ((ArrayList) term151574).add(term151578);
        ((ArrayList) term151574).add(term151580);
        ((ArrayList) term151574).add(term151582);
        ((ArrayList) term151574).add(term151584);
        Integer term151590 = new Integer(1610419467);
        Integer term151592 = new Integer(1155135931);
        Integer term151594 = new Integer(-636910567);
        Integer term151596 = new Integer(1896114203);
        ArrayList term151588 = new ArrayList();
        ((ArrayList) term151588).add(term151590);
        ((ArrayList) term151588).add(term151592);
        ((ArrayList) term151588).add(term151594);
        ((ArrayList) term151588).add(term151596);
        Integer term151880 = new Integer(1045745470);
        Integer term151882 = new Integer(892741901);
        Integer term151884 = new Integer(-1724900201);
        ArrayList term151878 = new ArrayList();
        ((ArrayList) term151878).add(term151880);
        ((ArrayList) term151878).add(term151882);
        ((ArrayList) term151878).add(term151884);
        ArrayList term151888 = new ArrayList();
        term151507 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term151509 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term151511 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term151527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151532 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151542 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term151507, term151507.getClass(), "id", 4638802650052629192L);
        setLongField(term151509, term151509.getClass(), "id", -5129146795829557004L);
        setLongField(term151511, term151511.getClass(), "id", -4651290065282223905L);
        setField(term151511, term151511.getClass(), "extId", term151513);
        setField(term151511, term151511.getClass(), "luid", "rqjMeNBTEM");
        setIntField(term151528, term151528.getClass(), "year", 2010);
        setShortField(term151528, term151528.getClass(), "month", (short) 11);
        setShortField(term151528, term151528.getClass(), "day", (short) 12);
        setField(term151527, term151527.getClass(), "date", term151528);
        setByteField(term151532, term151532.getClass(), "hour", (byte) 19);
        setByteField(term151532, term151532.getClass(), "minute", (byte) 8);
        setByteField(term151532, term151532.getClass(), "second", (byte) 0);
        setIntField(term151532, term151532.getClass(), "nano", 224480743);
        setField(term151527, term151527.getClass(), "time", term151532);
        setField(term151511, term151511.getClass(), "registerTime", term151527);
        setIntField(term151538, term151538.getClass(), "year", 2023);
        setShortField(term151538, term151538.getClass(), "month", (short) 6);
        setShortField(term151538, term151538.getClass(), "day", (short) 11);
        setField(term151537, term151537.getClass(), "date", term151538);
        setByteField(term151542, term151542.getClass(), "hour", (byte) 20);
        setByteField(term151542, term151542.getClass(), "minute", (byte) 37);
        setByteField(term151542, term151542.getClass(), "second", (byte) 26);
        setIntField(term151542, term151542.getClass(), "nano", 879792435);
        setField(term151537, term151537.getClass(), "time", term151542);
        setField(term151511, term151511.getClass(), "accessTime", term151537);
        setField(term151509, term151509.getClass(), "card", term151511);
        setField(term151509, term151509.getClass(), "userName", "WNUzKkDpZX");
        setIntField(term151509, term151509.getClass(), "isNetMember", -492305893);
        setIntField(term151509, term151509.getClass(), "iconId", -1969736424);
        setIntField(term151509, term151509.getClass(), "plateId", 1464895284);
        setIntField(term151509, term151509.getClass(), "titleId", 1538680141);
        setIntField(term151509, term151509.getClass(), "partnerId", -506059418);
        setIntField(term151509, term151509.getClass(), "frameId", -1577159884);
        setIntField(term151509, term151509.getClass(), "selectMapId", -863958105);
        setIntField(term151509, term151509.getClass(), "totalAwake", 622092405);
        setIntField(term151509, term151509.getClass(), "gradeRating", -1454644959);
        setIntField(term151509, term151509.getClass(), "musicRating", 101535830);
        setIntField(term151509, term151509.getClass(), "playerRating", 1139143083);
        setIntField(term151509, term151509.getClass(), "highestRating", 1041163234);
        setIntField(term151509, term151509.getClass(), "gradeRank", 698385520);
        setIntField(term151509, term151509.getClass(), "classRank", 849449580);
        setIntField(term151509, term151509.getClass(), "courseRank", 223713903);
        setField(term151509, term151509.getClass(), "charaSlot", term151574);
        setField(term151509, term151509.getClass(), "charaLockSlot", term151588);
        setLongField(term151509, term151509.getClass(), "contentBit", -6444076581960764384L);
        setIntField(term151509, term151509.getClass(), "playCount", 1671953554);
        setField(term151509, term151509.getClass(), "eventWatchedDate", "aduqofSIXN");
        setField(term151509, term151509.getClass(), "lastGameId", "oDCJeRRdBM");
        setField(term151509, term151509.getClass(), "lastRomVersion", "RqPlzjjWzi");
        setField(term151509, term151509.getClass(), "lastDataVersion", "rTGRmrdzoJ");
        setField(term151509, term151509.getClass(), "lastLoginDate", "ZWjeJhPPnm");
        setField(term151509, term151509.getClass(), "lastPlayDate", "yPIlHPlNib");
        setIntField(term151509, term151509.getClass(), "lastPlayCredit", 478755818);
        setIntField(term151509, term151509.getClass(), "lastPlayMode", -1272313823);
        setIntField(term151509, term151509.getClass(), "lastPlaceId", -872110316);
        setField(term151509, term151509.getClass(), "lastPlaceName", "qdtUDYxxKy");
        setIntField(term151509, term151509.getClass(), "lastAllNetId", -1523155561);
        setIntField(term151509, term151509.getClass(), "lastRegionId", 538636137);
        setField(term151509, term151509.getClass(), "lastRegionName", "fSxuiDFwrP");
        setField(term151509, term151509.getClass(), "lastClientId", "kkVoDibEgl");
        setField(term151509, term151509.getClass(), "lastCountryCode", "PLwKYMwKMG");
        setIntField(term151509, term151509.getClass(), "lastSelectEMoney", 1198486550);
        setIntField(term151509, term151509.getClass(), "lastSelectTicket", 1991523491);
        setIntField(term151509, term151509.getClass(), "lastSelectCourse", 1175856889);
        setIntField(term151509, term151509.getClass(), "lastCountCourse", -1544836830);
        setField(term151509, term151509.getClass(), "firstGameId", "iNAPriOsZk");
        setField(term151509, term151509.getClass(), "firstRomVersion", "WIzLNHlHin");
        setField(term151509, term151509.getClass(), "firstDataVersion", "uXqaYisYbX");
        setField(term151509, term151509.getClass(), "firstPlayDate", "GoCyvRPeGu");
        setField(term151509, term151509.getClass(), "compatibleCmVersion", "qokvePyIUm");
        setField(term151509, term151509.getClass(), "dailyBonusDate", "mdkCDAisEP");
        setField(term151509, term151509.getClass(), "dailyCourseBonusDate", "KCXlVnMQNa");
        setField(term151509, term151509.getClass(), "lastPairLoginDate", "itHxInHLQD");
        setField(term151509, term151509.getClass(), "lastTrialPlayDate", "YKcZHffhWM");
        setIntField(term151509, term151509.getClass(), "playVsCount", 836331634);
        setIntField(term151509, term151509.getClass(), "playSyncCount", -1611918528);
        setIntField(term151509, term151509.getClass(), "winCount", -1007102246);
        setIntField(term151509, term151509.getClass(), "helpCount", 284875252);
        setIntField(term151509, term151509.getClass(), "comboCount", -1037642084);
        setLongField(term151509, term151509.getClass(), "totalDeluxscore", 7618477983866578895L);
        setLongField(term151509, term151509.getClass(), "totalBasicDeluxscore", 8206014169713481037L);
        setLongField(term151509, term151509.getClass(), "totalAdvancedDeluxscore", -8954633111724973975L);
        setLongField(term151509, term151509.getClass(), "totalExpertDeluxscore", -5717341521813049090L);
        setLongField(term151509, term151509.getClass(), "totalMasterDeluxscore", 7473343065111041659L);
        setLongField(term151509, term151509.getClass(), "totalReMasterDeluxscore", 2495668465855448583L);
        setIntField(term151509, term151509.getClass(), "totalSync", -1771453281);
        setIntField(term151509, term151509.getClass(), "totalBasicSync", -1850267429);
        setIntField(term151509, term151509.getClass(), "totalAdvancedSync", 1810435844);
        setIntField(term151509, term151509.getClass(), "totalExpertSync", 733566791);
        setIntField(term151509, term151509.getClass(), "totalMasterSync", 1116868023);
        setIntField(term151509, term151509.getClass(), "totalReMasterSync", -880728130);
        setLongField(term151509, term151509.getClass(), "totalAchievement", -1187939257692936179L);
        setLongField(term151509, term151509.getClass(), "totalBasicAchievement", 4856903758483191927L);
        setLongField(term151509, term151509.getClass(), "totalAdvancedAchievement", -25599494357789464L);
        setLongField(term151509, term151509.getClass(), "totalExpertAchievement", -7734637563722873167L);
        setLongField(term151509, term151509.getClass(), "totalMasterAchievement", 7459242265957184087L);
        setLongField(term151509, term151509.getClass(), "totalReMasterAchievement", -650292226426573604L);
        setLongField(term151509, term151509.getClass(), "playerOldRating", 6666616792740026161L);
        setLongField(term151509, term151509.getClass(), "playerNewRating", -8562629129795659140L);
        setIntField(term151509, term151509.getClass(), "banState", -931337079);
        setLongField(term151509, term151509.getClass(), "dateTime", -7178730042193345514L);
        setField(term151507, term151507.getClass(), "user", term151509);
        setIntField(term151507, term151507.getClass(), "selectMusicId", 1123970734);
        setIntField(term151507, term151507.getClass(), "selectDifficultyId", -649594954);
        setIntField(term151507, term151507.getClass(), "categoryIndex", 70645068);
        setIntField(term151507, term151507.getClass(), "musicIndex", -151223836);
        setIntField(term151507, term151507.getClass(), "extraFlag", 1752322336);
        setIntField(term151507, term151507.getClass(), "selectScoreType", 173612084);
        setLongField(term151507, term151507.getClass(), "extendContentBit", 1966338447677234785L);
        setBooleanField(term151507, term151507.getClass(), "isPhotoAgree", false);
        setBooleanField(term151507, term151507.getClass(), "isGotoCodeRead", false);
        setBooleanField(term151507, term151507.getClass(), "selectResultDetails", false);
        setIntField(term151507, term151507.getClass(), "sortCategorySetting", 1186172025);
        setIntField(term151507, term151507.getClass(), "sortMusicSetting", -323007757);
        setField(term151507, term151507.getClass(), "selectedCardList", term151878);
        setField(term151507, term151507.getClass(), "encountMapNpcList", term151888);
        term151892 = new Long(-5183301625200604169L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term151892;
        callMethod(klass, "setId", argTypes, term151507, args);
    }

};


