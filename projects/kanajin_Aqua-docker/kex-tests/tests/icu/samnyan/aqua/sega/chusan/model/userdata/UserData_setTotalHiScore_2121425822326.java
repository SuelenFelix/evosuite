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

public class UserData_setTotalHiScore_2121425822326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286710;
     Object term286787;

    public UserData_setTotalHiScore_2121425822326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286710 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286710, term286710.getClass(), "id", 0L);
        setField(term286710, term286710.getClass(), "card", null);
        setField(term286710, term286710.getClass(), "userName", null);
        setIntField(term286710, term286710.getClass(), "level", 0);
        setIntField(term286710, term286710.getClass(), "reincarnationNum", 0);
        setField(term286710, term286710.getClass(), "exp", null);
        setLongField(term286710, term286710.getClass(), "point", 0L);
        setLongField(term286710, term286710.getClass(), "totalPoint", 0L);
        setIntField(term286710, term286710.getClass(), "playCount", 0);
        setIntField(term286710, term286710.getClass(), "multiPlayCount", 0);
        setIntField(term286710, term286710.getClass(), "playerRating", 0);
        setIntField(term286710, term286710.getClass(), "highestRating", 0);
        setIntField(term286710, term286710.getClass(), "nameplateId", 0);
        setIntField(term286710, term286710.getClass(), "frameId", 0);
        setIntField(term286710, term286710.getClass(), "characterId", 0);
        setIntField(term286710, term286710.getClass(), "trophyId", 0);
        setIntField(term286710, term286710.getClass(), "playedTutorialBit", 0);
        setIntField(term286710, term286710.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286710, term286710.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286710, term286710.getClass(), "totalMapNum", 0);
        setLongField(term286710, term286710.getClass(), "totalHiScore", 0L);
        setLongField(term286710, term286710.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286710, term286710.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286710, term286710.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286710, term286710.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286710, term286710.getClass(), "totalUltimaHighScore", 0L);
        setField(term286710, term286710.getClass(), "eventWatchedDate", null);
        setIntField(term286710, term286710.getClass(), "friendCount", 0);
        setField(term286710, term286710.getClass(), "firstGameId", null);
        setField(term286710, term286710.getClass(), "firstRomVersion", null);
        setField(term286710, term286710.getClass(), "firstDataVersion", null);
        setField(term286710, term286710.getClass(), "firstPlayDate", null);
        setField(term286710, term286710.getClass(), "lastGameId", null);
        setField(term286710, term286710.getClass(), "lastRomVersion", null);
        setField(term286710, term286710.getClass(), "lastDataVersion", null);
        setField(term286710, term286710.getClass(), "lastLoginDate", null);
        setField(term286710, term286710.getClass(), "lastPlayDate", null);
        setIntField(term286710, term286710.getClass(), "lastPlaceId", 0);
        setField(term286710, term286710.getClass(), "lastPlaceName", null);
        setField(term286710, term286710.getClass(), "lastRegionId", null);
        setField(term286710, term286710.getClass(), "lastRegionName", null);
        setField(term286710, term286710.getClass(), "lastAllNetId", null);
        setField(term286710, term286710.getClass(), "lastClientId", null);
        setField(term286710, term286710.getClass(), "lastCountryCode", null);
        setField(term286710, term286710.getClass(), "userNameEx", null);
        setField(term286710, term286710.getClass(), "compatibleCmVersion", null);
        setIntField(term286710, term286710.getClass(), "medal", 0);
        setIntField(term286710, term286710.getClass(), "mapIconId", 0);
        setIntField(term286710, term286710.getClass(), "voiceId", 0);
        setIntField(term286710, term286710.getClass(), "avatarWear", 0);
        setIntField(term286710, term286710.getClass(), "avatarHead", 0);
        setIntField(term286710, term286710.getClass(), "avatarFace", 0);
        setIntField(term286710, term286710.getClass(), "avatarSkin", 0);
        setIntField(term286710, term286710.getClass(), "avatarItem", 0);
        setIntField(term286710, term286710.getClass(), "avatarFront", 0);
        setIntField(term286710, term286710.getClass(), "avatarBack", 0);
        setIntField(term286710, term286710.getClass(), "classEmblemBase", 0);
        setIntField(term286710, term286710.getClass(), "classEmblemMedal", 0);
        setIntField(term286710, term286710.getClass(), "stockedGridCount", 0);
        setIntField(term286710, term286710.getClass(), "exMapLoopCount", 0);
        setIntField(term286710, term286710.getClass(), "netBattlePlayCount", 0);
        setIntField(term286710, term286710.getClass(), "netBattleWinCount", 0);
        setIntField(term286710, term286710.getClass(), "netBattleLoseCount", 0);
        setIntField(term286710, term286710.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286710, term286710.getClass(), "charaIllustId", 0);
        setIntField(term286710, term286710.getClass(), "skillId", 0);
        setIntField(term286710, term286710.getClass(), "overPowerPoint", 0);
        setIntField(term286710, term286710.getClass(), "overPowerRate", 0);
        setIntField(term286710, term286710.getClass(), "overPowerLowerRank", 0);
        setIntField(term286710, term286710.getClass(), "avatarPoint", 0);
        setIntField(term286710, term286710.getClass(), "battleRankId", 0);
        setIntField(term286710, term286710.getClass(), "battleRankPoint", 0);
        setIntField(term286710, term286710.getClass(), "eliteRankPoint", 0);
        setIntField(term286710, term286710.getClass(), "netBattle1stCount", 0);
        setIntField(term286710, term286710.getClass(), "netBattle2ndCount", 0);
        setIntField(term286710, term286710.getClass(), "netBattle3rdCount", 0);
        setIntField(term286710, term286710.getClass(), "netBattle4thCount", 0);
        setIntField(term286710, term286710.getClass(), "netBattleCorrection", 0);
        setIntField(term286710, term286710.getClass(), "netBattleErrCnt", 0);
        setIntField(term286710, term286710.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286710, term286710.getClass(), "battleRewardStatus", 0);
        setIntField(term286710, term286710.getClass(), "battleRewardIndex", 0);
        setIntField(term286710, term286710.getClass(), "battleRewardCount", 0);
        setIntField(term286710, term286710.getClass(), "ext1", 0);
        setIntField(term286710, term286710.getClass(), "ext2", 0);
        setIntField(term286710, term286710.getClass(), "ext3", 0);
        setIntField(term286710, term286710.getClass(), "ext4", 0);
        setIntField(term286710, term286710.getClass(), "ext5", 0);
        setIntField(term286710, term286710.getClass(), "ext6", 0);
        setIntField(term286710, term286710.getClass(), "ext7", 0);
        setIntField(term286710, term286710.getClass(), "ext8", 0);
        setIntField(term286710, term286710.getClass(), "ext9", 0);
        setIntField(term286710, term286710.getClass(), "ext10", 0);
        setField(term286710, term286710.getClass(), "extStr1", null);
        setField(term286710, term286710.getClass(), "extStr2", null);
        setLongField(term286710, term286710.getClass(), "extLong1", 0L);
        setLongField(term286710, term286710.getClass(), "extLong2", 0L);
        setField(term286710, term286710.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286710, term286710.getClass(), "isNetBattleHost", false);
        setIntField(term286710, term286710.getClass(), "netBattleEndState", 0);
        term286787 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term286787;
        callMethod(klass, "setTotalHiScore", argTypes, term286710, args);
    }

};


