package entities;

import entities.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-29T15:36:38")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Post> post;
    public static volatile SingularAttribute<Comment, String> review;
    public static volatile SingularAttribute<Comment, Long> id;

}