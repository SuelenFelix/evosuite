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

public class UserData_setExp_869367077312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220128;

    public UserData_setExp_869367077312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220128 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4220128, term4220128.getClass(), "id", 0L);
        setField(term4220128, term4220128.getClass(), "card", null);
        setField(term4220128, term4220128.getClass(), "userName", null);
        setIntField(term4220128, term4220128.getClass(), "level", 0);
        setIntField(term4220128, term4220128.getClass(), "reincarnationNum", 0);
        setField(term4220128, term4220128.getClass(), "exp", null);
        setLongField(term4220128, term4220128.getClass(), "point", 0L);
        setLongField(term4220128, term4220128.getClass(), "totalPoint", 0L);
        setIntField(term4220128, term4220128.getClass(), "playCount", 0);
        setIntField(term4220128, term4220128.getClass(), "multiPlayCount", 0);
        setIntField(term4220128, term4220128.getClass(), "playerRating", 0);
        setIntField(term4220128, term4220128.getClass(), "highestRating", 0);
        setIntField(term4220128, term4220128.getClass(), "nameplateId", 0);
        setIntField(term4220128, term4220128.getClass(), "frameId", 0);
        setIntField(term4220128, term4220128.getClass(), "characterId", 0);
        setIntField(term4220128, term4220128.getClass(), "trophyId", 0);
        setIntField(term4220128, term4220128.getClass(), "playedTutorialBit", 0);
        setIntField(term4220128, term4220128.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4220128, term4220128.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4220128, term4220128.getClass(), "totalMapNum", 0);
        setLongField(term4220128, term4220128.getClass(), "totalHiScore", 0L);
        setLongField(term4220128, term4220128.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4220128, term4220128.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4220128, term4220128.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4220128, term4220128.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4220128, term4220128.getClass(), "totalUltimaHighScore", 0L);
        setField(term4220128, term4220128.getClass(), "eventWatchedDate", null);
        setIntField(term4220128, term4220128.getClass(), "friendCount", 0);
        setField(term4220128, term4220128.getClass(), "firstGameId", null);
        setField(term4220128, term4220128.getClass(), "firstRomVersion", null);
        setField(term4220128, term4220128.getClass(), "firstDataVersion", null);
        setField(term4220128, term4220128.getClass(), "firstPlayDate", null);
        setField(term4220128, term4220128.getClass(), "lastGameId", null);
        setField(term4220128, term4220128.getClass(), "lastRomVersion", null);
        setField(term4220128, term4220128.getClass(), "lastDataVersion", null);
        setField(term4220128, term4220128.getClass(), "lastLoginDate", null);
        setField(term4220128, term4220128.getClass(), "lastPlayDate", null);
        setIntField(term4220128, term4220128.getClass(), "lastPlaceId", 0);
        setField(term4220128, term4220128.getClass(), "lastPlaceName", null);
        setField(term4220128, term4220128.getClass(), "lastRegionId", null);
        setField(term4220128, term4220128.getClass(), "lastRegionName", null);
        setField(term4220128, term4220128.getClass(), "lastAllNetId", null);
        setField(term4220128, term4220128.getClass(), "lastClientId", null);
        setField(term4220128, term4220128.getClass(), "lastCountryCode", null);
        setField(term4220128, term4220128.getClass(), "userNameEx", null);
        setField(term4220128, term4220128.getClass(), "compatibleCmVersion", null);
        setIntField(term4220128, term4220128.getClass(), "medal", 0);
        setIntField(term4220128, term4220128.getClass(), "mapIconId", 0);
        setIntField(term4220128, term4220128.getClass(), "voiceId", 0);
        setIntField(term4220128, term4220128.getClass(), "avatarWear", 0);
        setIntField(term4220128, term4220128.getClass(), "avatarHead", 0);
        setIntField(term4220128, term4220128.getClass(), "avatarFace", 0);
        setIntField(term4220128, term4220128.getClass(), "avatarSkin", 0);
        setIntField(term4220128, term4220128.getClass(), "avatarItem", 0);
        setIntField(term4220128, term4220128.getClass(), "avatarFront", 0);
        setIntField(term4220128, term4220128.getClass(), "avatarBack", 0);
        setIntField(term4220128, term4220128.getClass(), "classEmblemBase", 0);
        setIntField(term4220128, term4220128.getClass(), "classEmblemMedal", 0);
        setIntField(term4220128, term4220128.getClass(), "stockedGridCount", 0);
        setIntField(term4220128, term4220128.getClass(), "exMapLoopCount", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattlePlayCount", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattleWinCount", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattleLoseCount", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4220128, term4220128.getClass(), "charaIllustId", 0);
        setIntField(term4220128, term4220128.getClass(), "skillId", 0);
        setIntField(term4220128, term4220128.getClass(), "overPowerPoint", 0);
        setIntField(term4220128, term4220128.getClass(), "overPowerRate", 0);
        setIntField(term4220128, term4220128.getClass(), "overPowerLowerRank", 0);
        setIntField(term4220128, term4220128.getClass(), "avatarPoint", 0);
        setIntField(term4220128, term4220128.getClass(), "battleRankId", 0);
        setIntField(term4220128, term4220128.getClass(), "battleRankPoint", 0);
        setIntField(term4220128, term4220128.getClass(), "eliteRankPoint", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattle1stCount", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattle2ndCount", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattle3rdCount", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattle4thCount", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattleCorrection", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattleErrCnt", 0);
        setIntField(term4220128, term4220128.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4220128, term4220128.getClass(), "battleRewardStatus", 0);
        setIntField(term4220128, term4220128.getClass(), "battleRewardIndex", 0);
        setIntField(term4220128, term4220128.getClass(), "battleRewardCount", 0);
        setIntField(term4220128, term4220128.getClass(), "ext1", 0);
        setIntField(term4220128, term4220128.getClass(), "ext2", 0);
        setIntField(term4220128, term4220128.getClass(), "ext3", 0);
        setIntField(term4220128, term4220128.getClass(), "ext4", 0);
        setIntField(term4220128, term4220128.getClass(), "ext5", 0);
        setIntField(term4220128, term4220128.getClass(), "ext6", 0);
        setIntField(term4220128, term4220128.getClass(), "ext7", 0);
        setIntField(term4220128, term4220128.getClass(), "ext8", 0);
        setIntField(term4220128, term4220128.getClass(), "ext9", 0);
        setIntField(term4220128, term4220128.getClass(), "ext10", 0);
        setField(term4220128, term4220128.getClass(), "extStr1", null);
        setField(term4220128, term4220128.getClass(), "extStr2", null);
        setLongField(term4220128, term4220128.getClass(), "extLong1", 0L);
        setLongField(term4220128, term4220128.getClass(), "extLong2", 0L);
        setField(term4220128, term4220128.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4220128, term4220128.getClass(), "isNetBattleHost", false);
        setIntField(term4220128, term4220128.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExp", argTypes, term4220128, args);
    }

};


