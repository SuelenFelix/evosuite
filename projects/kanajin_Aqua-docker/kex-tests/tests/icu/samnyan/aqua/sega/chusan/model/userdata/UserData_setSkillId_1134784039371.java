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
import java.lang.Integer;

public class UserData_setSkillId_1134784039371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290229;
     Object term290306;

    public UserData_setSkillId_1134784039371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290229 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290229, term290229.getClass(), "id", 0L);
        setField(term290229, term290229.getClass(), "card", null);
        setField(term290229, term290229.getClass(), "userName", null);
        setIntField(term290229, term290229.getClass(), "level", 0);
        setIntField(term290229, term290229.getClass(), "reincarnationNum", 0);
        setField(term290229, term290229.getClass(), "exp", null);
        setLongField(term290229, term290229.getClass(), "point", 0L);
        setLongField(term290229, term290229.getClass(), "totalPoint", 0L);
        setIntField(term290229, term290229.getClass(), "playCount", 0);
        setIntField(term290229, term290229.getClass(), "multiPlayCount", 0);
        setIntField(term290229, term290229.getClass(), "playerRating", 0);
        setIntField(term290229, term290229.getClass(), "highestRating", 0);
        setIntField(term290229, term290229.getClass(), "nameplateId", 0);
        setIntField(term290229, term290229.getClass(), "frameId", 0);
        setIntField(term290229, term290229.getClass(), "characterId", 0);
        setIntField(term290229, term290229.getClass(), "trophyId", 0);
        setIntField(term290229, term290229.getClass(), "playedTutorialBit", 0);
        setIntField(term290229, term290229.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290229, term290229.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290229, term290229.getClass(), "totalMapNum", 0);
        setLongField(term290229, term290229.getClass(), "totalHiScore", 0L);
        setLongField(term290229, term290229.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290229, term290229.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290229, term290229.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290229, term290229.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290229, term290229.getClass(), "totalUltimaHighScore", 0L);
        setField(term290229, term290229.getClass(), "eventWatchedDate", null);
        setIntField(term290229, term290229.getClass(), "friendCount", 0);
        setField(term290229, term290229.getClass(), "firstGameId", null);
        setField(term290229, term290229.getClass(), "firstRomVersion", null);
        setField(term290229, term290229.getClass(), "firstDataVersion", null);
        setField(term290229, term290229.getClass(), "firstPlayDate", null);
        setField(term290229, term290229.getClass(), "lastGameId", null);
        setField(term290229, term290229.getClass(), "lastRomVersion", null);
        setField(term290229, term290229.getClass(), "lastDataVersion", null);
        setField(term290229, term290229.getClass(), "lastLoginDate", null);
        setField(term290229, term290229.getClass(), "lastPlayDate", null);
        setIntField(term290229, term290229.getClass(), "lastPlaceId", 0);
        setField(term290229, term290229.getClass(), "lastPlaceName", null);
        setField(term290229, term290229.getClass(), "lastRegionId", null);
        setField(term290229, term290229.getClass(), "lastRegionName", null);
        setField(term290229, term290229.getClass(), "lastAllNetId", null);
        setField(term290229, term290229.getClass(), "lastClientId", null);
        setField(term290229, term290229.getClass(), "lastCountryCode", null);
        setField(term290229, term290229.getClass(), "userNameEx", null);
        setField(term290229, term290229.getClass(), "compatibleCmVersion", null);
        setIntField(term290229, term290229.getClass(), "medal", 0);
        setIntField(term290229, term290229.getClass(), "mapIconId", 0);
        setIntField(term290229, term290229.getClass(), "voiceId", 0);
        setIntField(term290229, term290229.getClass(), "avatarWear", 0);
        setIntField(term290229, term290229.getClass(), "avatarHead", 0);
        setIntField(term290229, term290229.getClass(), "avatarFace", 0);
        setIntField(term290229, term290229.getClass(), "avatarSkin", 0);
        setIntField(term290229, term290229.getClass(), "avatarItem", 0);
        setIntField(term290229, term290229.getClass(), "avatarFront", 0);
        setIntField(term290229, term290229.getClass(), "avatarBack", 0);
        setIntField(term290229, term290229.getClass(), "classEmblemBase", 0);
        setIntField(term290229, term290229.getClass(), "classEmblemMedal", 0);
        setIntField(term290229, term290229.getClass(), "stockedGridCount", 0);
        setIntField(term290229, term290229.getClass(), "exMapLoopCount", 0);
        setIntField(term290229, term290229.getClass(), "netBattlePlayCount", 0);
        setIntField(term290229, term290229.getClass(), "netBattleWinCount", 0);
        setIntField(term290229, term290229.getClass(), "netBattleLoseCount", 0);
        setIntField(term290229, term290229.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290229, term290229.getClass(), "charaIllustId", 0);
        setIntField(term290229, term290229.getClass(), "skillId", 0);
        setIntField(term290229, term290229.getClass(), "overPowerPoint", 0);
        setIntField(term290229, term290229.getClass(), "overPowerRate", 0);
        setIntField(term290229, term290229.getClass(), "overPowerLowerRank", 0);
        setIntField(term290229, term290229.getClass(), "avatarPoint", 0);
        setIntField(term290229, term290229.getClass(), "battleRankId", 0);
        setIntField(term290229, term290229.getClass(), "battleRankPoint", 0);
        setIntField(term290229, term290229.getClass(), "eliteRankPoint", 0);
        setIntField(term290229, term290229.getClass(), "netBattle1stCount", 0);
        setIntField(term290229, term290229.getClass(), "netBattle2ndCount", 0);
        setIntField(term290229, term290229.getClass(), "netBattle3rdCount", 0);
        setIntField(term290229, term290229.getClass(), "netBattle4thCount", 0);
        setIntField(term290229, term290229.getClass(), "netBattleCorrection", 0);
        setIntField(term290229, term290229.getClass(), "netBattleErrCnt", 0);
        setIntField(term290229, term290229.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290229, term290229.getClass(), "battleRewardStatus", 0);
        setIntField(term290229, term290229.getClass(), "battleRewardIndex", 0);
        setIntField(term290229, term290229.getClass(), "battleRewardCount", 0);
        setIntField(term290229, term290229.getClass(), "ext1", 0);
        setIntField(term290229, term290229.getClass(), "ext2", 0);
        setIntField(term290229, term290229.getClass(), "ext3", 0);
        setIntField(term290229, term290229.getClass(), "ext4", 0);
        setIntField(term290229, term290229.getClass(), "ext5", 0);
        setIntField(term290229, term290229.getClass(), "ext6", 0);
        setIntField(term290229, term290229.getClass(), "ext7", 0);
        setIntField(term290229, term290229.getClass(), "ext8", 0);
        setIntField(term290229, term290229.getClass(), "ext9", 0);
        setIntField(term290229, term290229.getClass(), "ext10", 0);
        setField(term290229, term290229.getClass(), "extStr1", null);
        setField(term290229, term290229.getClass(), "extStr2", null);
        setLongField(term290229, term290229.getClass(), "extLong1", 0L);
        setLongField(term290229, term290229.getClass(), "extLong2", 0L);
        setField(term290229, term290229.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290229, term290229.getClass(), "isNetBattleHost", false);
        setIntField(term290229, term290229.getClass(), "netBattleEndState", 0);
        term290306 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290306;
        callMethod(klass, "setSkillId", argTypes, term290229, args);
    }

};


