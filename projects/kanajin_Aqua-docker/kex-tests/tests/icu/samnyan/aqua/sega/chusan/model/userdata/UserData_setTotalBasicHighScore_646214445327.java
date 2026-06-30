package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserData_setTotalBasicHighScore_646214445327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286789;
     Object term286866;

    public UserData_setTotalBasicHighScore_646214445327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286789 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286789, term286789.getClass(), "id", 0L);
        setField(term286789, term286789.getClass(), "card", null);
        setField(term286789, term286789.getClass(), "userName", null);
        setIntField(term286789, term286789.getClass(), "level", 0);
        setIntField(term286789, term286789.getClass(), "reincarnationNum", 0);
        setField(term286789, term286789.getClass(), "exp", null);
        setLongField(term286789, term286789.getClass(), "point", 0L);
        setLongField(term286789, term286789.getClass(), "totalPoint", 0L);
        setIntField(term286789, term286789.getClass(), "playCount", 0);
        setIntField(term286789, term286789.getClass(), "multiPlayCount", 0);
        setIntField(term286789, term286789.getClass(), "playerRating", 0);
        setIntField(term286789, term286789.getClass(), "highestRating", 0);
        setIntField(term286789, term286789.getClass(), "nameplateId", 0);
        setIntField(term286789, term286789.getClass(), "frameId", 0);
        setIntField(term286789, term286789.getClass(), "characterId", 0);
        setIntField(term286789, term286789.getClass(), "trophyId", 0);
        setIntField(term286789, term286789.getClass(), "playedTutorialBit", 0);
        setIntField(term286789, term286789.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286789, term286789.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286789, term286789.getClass(), "totalMapNum", 0);
        setLongField(term286789, term286789.getClass(), "totalHiScore", 0L);
        setLongField(term286789, term286789.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286789, term286789.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286789, term286789.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286789, term286789.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286789, term286789.getClass(), "totalUltimaHighScore", 0L);
        setField(term286789, term286789.getClass(), "eventWatchedDate", null);
        setIntField(term286789, term286789.getClass(), "friendCount", 0);
        setField(term286789, term286789.getClass(), "firstGameId", null);
        setField(term286789, term286789.getClass(), "firstRomVersion", null);
        setField(term286789, term286789.getClass(), "firstDataVersion", null);
        setField(term286789, term286789.getClass(), "firstPlayDate", null);
        setField(term286789, term286789.getClass(), "lastGameId", null);
        setField(term286789, term286789.getClass(), "lastRomVersion", null);
        setField(term286789, term286789.getClass(), "lastDataVersion", null);
        setField(term286789, term286789.getClass(), "lastLoginDate", null);
        setField(term286789, term286789.getClass(), "lastPlayDate", null);
        setIntField(term286789, term286789.getClass(), "lastPlaceId", 0);
        setField(term286789, term286789.getClass(), "lastPlaceName", null);
        setField(term286789, term286789.getClass(), "lastRegionId", null);
        setField(term286789, term286789.getClass(), "lastRegionName", null);
        setField(term286789, term286789.getClass(), "lastAllNetId", null);
        setField(term286789, term286789.getClass(), "lastClientId", null);
        setField(term286789, term286789.getClass(), "lastCountryCode", null);
        setField(term286789, term286789.getClass(), "userNameEx", null);
        setField(term286789, term286789.getClass(), "compatibleCmVersion", null);
        setIntField(term286789, term286789.getClass(), "medal", 0);
        setIntField(term286789, term286789.getClass(), "mapIconId", 0);
        setIntField(term286789, term286789.getClass(), "voiceId", 0);
        setIntField(term286789, term286789.getClass(), "avatarWear", 0);
        setIntField(term286789, term286789.getClass(), "avatarHead", 0);
        setIntField(term286789, term286789.getClass(), "avatarFace", 0);
        setIntField(term286789, term286789.getClass(), "avatarSkin", 0);
        setIntField(term286789, term286789.getClass(), "avatarItem", 0);
        setIntField(term286789, term286789.getClass(), "avatarFront", 0);
        setIntField(term286789, term286789.getClass(), "avatarBack", 0);
        setIntField(term286789, term286789.getClass(), "classEmblemBase", 0);
        setIntField(term286789, term286789.getClass(), "classEmblemMedal", 0);
        setIntField(term286789, term286789.getClass(), "stockedGridCount", 0);
        setIntField(term286789, term286789.getClass(), "exMapLoopCount", 0);
        setIntField(term286789, term286789.getClass(), "netBattlePlayCount", 0);
        setIntField(term286789, term286789.getClass(), "netBattleWinCount", 0);
        setIntField(term286789, term286789.getClass(), "netBattleLoseCount", 0);
        setIntField(term286789, term286789.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286789, term286789.getClass(), "charaIllustId", 0);
        setIntField(term286789, term286789.getClass(), "skillId", 0);
        setIntField(term286789, term286789.getClass(), "overPowerPoint", 0);
        setIntField(term286789, term286789.getClass(), "overPowerRate", 0);
        setIntField(term286789, term286789.getClass(), "overPowerLowerRank", 0);
        setIntField(term286789, term286789.getClass(), "avatarPoint", 0);
        setIntField(term286789, term286789.getClass(), "battleRankId", 0);
        setIntField(term286789, term286789.getClass(), "battleRankPoint", 0);
        setIntField(term286789, term286789.getClass(), "eliteRankPoint", 0);
        setIntField(term286789, term286789.getClass(), "netBattle1stCount", 0);
        setIntField(term286789, term286789.getClass(), "netBattle2ndCount", 0);
        setIntField(term286789, term286789.getClass(), "netBattle3rdCount", 0);
        setIntField(term286789, term286789.getClass(), "netBattle4thCount", 0);
        setIntField(term286789, term286789.getClass(), "netBattleCorrection", 0);
        setIntField(term286789, term286789.getClass(), "netBattleErrCnt", 0);
        setIntField(term286789, term286789.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286789, term286789.getClass(), "battleRewardStatus", 0);
        setIntField(term286789, term286789.getClass(), "battleRewardIndex", 0);
        setIntField(term286789, term286789.getClass(), "battleRewardCount", 0);
        setIntField(term286789, term286789.getClass(), "ext1", 0);
        setIntField(term286789, term286789.getClass(), "ext2", 0);
        setIntField(term286789, term286789.getClass(), "ext3", 0);
        setIntField(term286789, term286789.getClass(), "ext4", 0);
        setIntField(term286789, term286789.getClass(), "ext5", 0);
        setIntField(term286789, term286789.getClass(), "ext6", 0);
        setIntField(term286789, term286789.getClass(), "ext7", 0);
        setIntField(term286789, term286789.getClass(), "ext8", 0);
        setIntField(term286789, term286789.getClass(), "ext9", 0);
        setIntField(term286789, term286789.getClass(), "ext10", 0);
        setField(term286789, term286789.getClass(), "extStr1", null);
        setField(term286789, term286789.getClass(), "extStr2", null);
        setLongField(term286789, term286789.getClass(), "extLong1", 0L);
        setLongField(term286789, term286789.getClass(), "extLong2", 0L);
        setField(term286789, term286789.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286789, term286789.getClass(), "isNetBattleHost", false);
        setIntField(term286789, term286789.getClass(), "netBattleEndState", 0);
        term286866 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term286866;
        callMethod(klass, "setTotalBasicHighScore", argTypes, term286789, args);
    }

};


