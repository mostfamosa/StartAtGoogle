package StartAtGoogle.Week3.CreationalPatternsBuilder;

import java.util.Date;

public class JobPosition {
    private final Date publishedDate;
    private final String title;
    private final boolean isRemote;
    private String description;
    private String location;
    private double salaryCap;
    private int yearsExperienceRequired;

    public static class Builder{
        //required Parameters
        private final Date publishedDate;
        private final String title;
        private final boolean isRemote;

        //optional Parameters
        private String description;
        private String location = "Tel Aviv";
        private double salaryCap;
        private int yearsExperienceRequired;

        public Builder(Date publishedDate, String title, boolean isRemote) {
            this.publishedDate = publishedDate;
            this.title = title;
            this.isRemote = isRemote;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder salaryCap(double salaryCap) {
            this.salaryCap = salaryCap;
            return this;
        }

        public Builder yearsExperienceRequired(int yearsExperienceRequired) {
            this.yearsExperienceRequired = yearsExperienceRequired;
            return this;
        }
        public JobPosition build(){
            return new JobPosition(this);
        }
    }
    private JobPosition(Builder builder){
        this.publishedDate=builder.publishedDate;
        this.title=builder.title;
        this.isRemote= builder.isRemote;
        this.description= builder.description;
        this.location= builder.location;
        this.salaryCap= builder.salaryCap;
        this.yearsExperienceRequired= builder.yearsExperienceRequired;
    }


}
